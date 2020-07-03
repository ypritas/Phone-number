import org.junit.Assert;
import org.junit.Test;

public class PhoneDecodeTest {

    @Test
    public void decodePhoneNumber() {
        String result = new PhoneDecoder().decode("OZONETOWERTHREETWO");
        Assert.assertEquals("01223", result);
    }

    @Test
    public void decodePhoneOneSevenNineNumber() {
        String result = new PhoneDecoder().decode("ONENINESEVEN");
        Assert.assertEquals("179", result);
    }

    @Test
    public void decodePhoneOneSevenSevenNineNumber() {
        String result = new PhoneDecoder().decode("ONENINESEVENSEVEN");
        Assert.assertEquals("1779", result);
    }

    @Test
    public void decodePhoneZERROONETWOTHREEFOURFIVESIXSEVENNINETENNumber() {
        String result = new PhoneDecoder().decode("ZERROONETWOTHREEFOURFIVESIXSEVENEIGHTNINE");
        Assert.assertEquals("0123456789", result);
    }

    @Test
    public void decodePhoneZERROONETWOTHREETHREEFOURFIVESIXSEVENEIGHTNINENumber() {
        String result = new PhoneDecoder().decode("ZERROONETWOTHREETHREEFOURFIVESIXSEVENEIGHTNINE");
        Assert.assertEquals("01233456789", result);
    }


    @Test
    public void decodeLongPhoneNumber() {
        String result = new PhoneDecoder().decode("GVSETTERRIOROEENOIHZVNNEREIXIHETFEWNUOSEF");
        Assert.assertEquals("0123456789", result);
    }


}
