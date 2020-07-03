import org.junit.Assert;
import org.junit.Test;

public class PhoneDecodeTest {

    @Test
    public void decodePhoneNumber() {
        String result = new PhoneDecoder().decode("OZONETOWERTHREETWO");
        Assert.assertEquals("01223", result);
    }

    @Test
    public void decodeLongPhoneNumber() {
        String result = new PhoneDecoder().decode("UITEHEEOEIERSEXNTVFOIETENROGESNWIRFHHENTV");
        Assert.assertEquals("1233456789", result);
    }


}
