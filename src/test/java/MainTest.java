import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test_Given_WeWantToSeeAWelcomeMessage_When_WeGetTheMessage_Then_theMessageShouldBeExactlyStartingServer(){
        // arrange
        // act
        String actual = Main.GetMessage();
        // assert
        Assertions.assertEquals("Starting Server", actual);
    }
    @Test
    public void test_Given_WeWantToSeeASuccessMessage_When_WeGetTheMessage_Then_theMessageShouldBeExactlyServerStarted(){
        // arrange
        // act
        String actual = Main.PrintSuccess();
        // assert
        Assertions.assertEquals("Server Started", actual);
    }
}
