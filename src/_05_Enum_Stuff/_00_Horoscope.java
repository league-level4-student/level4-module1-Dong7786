package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.

	
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void state(Zodiac c) {
		
		switch(c) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "Aries energy helps us initiate, fight for our beliefs and fearlessly put ourselves out there.");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Enjoy earthly pleasures and get the job done.");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "Collaborate and fly our freak flags at full mast.");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Plant deep roots and feather our family nests.");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "Express ourselves boldly and wear our hearts on our sleeves.");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Do impeccable work and prioritize wellbeing—of ourselves, our loved ones and the planet.");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "Libra energy inspires us to seek peace, harmony and cooperation—and to do it with style and grace.");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "Scorpio energy helps us dive deep, merge our superpowers and form bonds that are built to last.");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "Chase the impossible and take fearless risks.");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "Capricorn energy teaches us the power of structure and long-term goals.");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Aquarius energy helps us innovate and unite for social justice.");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "Pisces energy awakens compassion, imagination and artistry, uniting us as one.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Umm, you have exited the known universe");
			break;
			
		}		
		
	}
	
	// 3. Make a main method to test your method
 public static void main(String[] args) {
	 _00_Horoscope horo = new _00_Horoscope();
	 
 }
 _00_Horoscope(){
	  Zodiac z = Zodiac.ARIES;
	 state(z);
	 
 }
	
}
