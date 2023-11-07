import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 500;
        boolean registered = true;
        long expected = 15;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 500;
        boolean registered = false;
        long expected = 5;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_100;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
    @Test
     public void shouldCalculateForUnregisteredAndOverLimit() {
         BonusService service = new BonusService();

         long amount = 100_000_000;
         boolean registered = false;
         long expected = 500;

         long actual = service.calculate(amount, registered);

         Assertions.assertEquals(expected, actual);
     }
}
