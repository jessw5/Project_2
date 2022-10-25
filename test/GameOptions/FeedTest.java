/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GameOptions;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Rabbit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jessi
 */
public class FeedTest {
    
    public FeedTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setPet method, of class Feed.
     */
    @Test
    public void testSetPet() {
        System.out.println("setPet");
        Animal pet = new Dog("Henry", "Blue");
        Feed instance = new Feed(pet, 1);
        instance.setPet(pet);
    }

    /**
     * Test of getFoodOption method, of class Feed.
     */
    @Test
    public void testGetFoodOption() {
        System.out.println("getFoodOption");
        Animal pet = new Cat("Whiskers", "Brown");
        Feed instance = new Feed(pet, 2);
        int expResult = 2;
        int result = instance.getFoodOption();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFoodOption method, of class Feed.
     */
    @Test
    public void testSetFoodOption() {
        System.out.println("setFoodOption");
        Animal pet = new Rabbit("Bunny", "Green");
        int foodOption = 3;
        Feed instance = new Feed(pet, foodOption);
        instance.setFoodOption(foodOption);
    }

    /**
     * Test of getFood method, of class Feed.
     */
    @Test
    public void testGetFood() {
        System.out.println("getFood");
        Animal pet = new Cat("Chico", "Red");
        Feed instance = new Feed(pet, 2);
        String expResult = "Intermediate Food: $4";
        String result = instance.getFood();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFoodHygiene method, of class Feed.
     */
    @Test
    public void testGetFoodHygiene() {
        System.out.println("getFoodHygiene");
        Animal pet = new Dog("Don", "Purple");
        Feed instance = new Feed(pet, 3);
        int expResult = 1;
        int result = instance.getFoodHygiene();
        assertEquals(expResult, result);
    }

    /**
     * Test of feedPet method, of class Feed.
     */
    @Test
    public void testFeedPet() {
        System.out.println("feedPet");
        Animal pet = new Rabbit("Bugs", "Blue");
        Feed instance = new Feed(pet, 1);
        String expResult = "Pet is fed Basic Food: $2\n" +
            "Pet Happiness is increased by 1\n" +
            "Happiness: 4\n" +
            "Pet Hunger is decreased by 1\n" +
            "Hunger: 2\n" +
            "Pet Hygiene is decreased by 3\n" +
            "Hygiene: 4\n" +
            "Money is decreased by 2\n" +
            "Money: 28";
        String result = instance.feedPet();
        assertEquals(expResult, result);
    }
    
}
