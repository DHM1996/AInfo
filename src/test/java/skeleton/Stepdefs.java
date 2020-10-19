package skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Stepdefs {
    private Character character;
    private String greet;

    @Given("a character")
    public void a_character() {
        this.character = new Character();
    }

    @When("I attack a character with common attack")
    public void i_attack_a_character_with_common_attack() {
        this.character.attackWithCommonAttack();
    }

    @Then("the health of the character must be {int}")
    public void the_health_of_the_character_must_be(Integer realHealth) throws Throwable {

        if (this.character.getHealth() != realHealth)
            throw new Exception();
    }

    @When("I attack character with a power of {int}")
    public void i_attack_character_with_a_power_of(Integer power) {
        this.character.attackWhithAPowerOf(power);
    }

    @When("I attack a character with a common attack four times")
    public void i_attack_a_character_with_a_common_attack_four_times() {
        for (int i = 0;i<4; i++)
            this.character.attackWithCommonAttack();
    }


    @Then("the character must be dead")
    public void the_character_must_be_dead() throws Throwable {
        if (!this.character.isDead())
            throw new Exception();
    }

    @When("the character transforms for the first time")
    public void the_character_transforms_for_the_first_time() {
        this.character.transform();
    }

    @Then("the character transformation must be {string}")
    public void the_character_transformation_must_be(String transformation)  throws Throwable{
        if (!character.getTransformation().equals(transformation))
            throw new Exception();
    }

    @When("the character transforms for the second time")
    public void the_character_transforms_for_the_second_time() {
        this.character.transform();
        this.character.transform();
    }

}