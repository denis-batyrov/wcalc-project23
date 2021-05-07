package DRAMa; //Пакет Java классов

//Импортируем библиотеки
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

//Объявляем класс
public class Image extends JComponent {
	private static final long serialVersionUID = 1L;
	BufferedImage image;

	public Image() {
	}

	public void loadImage(String imageName) {
		try {
			if (imageName == "Одностворчатое") {
				image = ImageIO.read(new URL("https://sun9-23.userapi.com/impg/ktThK3j8TEhFVTNLHUbxuSJACnynSf5UOT93jQ/kGA0aoJVjzQ.jpg?size=326x438&quality=96&proxy=1&sign=8d034a947d1789b8c9b3841302ff2660&type=album")); // Расположение изображения логотипа УГАТУ
			}
			if (imageName == "Двухстворчатое") {
				image = ImageIO.read(new URL("https://sun9-66.userapi.com/impg/uJ8zZB67Ks4AFABj8kecHg2pOJO121Ybv7obEA/xZBtWgjD-k0.jpg?size=326x438&quality=96&proxy=1&sign=d57c651c04765a0edab16fb5a8b8d3ea&type=album")); // Расположение изображения логотипа УГАТУ
			}
			if (imageName == "Двухстворчатое с фрамугой") {
				image = ImageIO.read(new URL("https://sun9-49.userapi.com/impg/pLNP6S0GXWBoqrrW_0tKY9pnEM_NfHKxeXfVyg/VLIU6sxTx60.jpg?size=326x438&quality=96&proxy=1&sign=a7c73175e4289bc933cde31a422ae997&type=album")); // Расположение изображения логотипа УГАТУ
			}
			if (imageName == "Трёхстворчатое") {
				image = ImageIO.read(new URL("https://sun9-33.userapi.com/impg/X6rO2VepRH4FRX2S0N5X8UrqRmn6Iebdj8iACA/MF_ue9l13wA.jpg?size=326x438&quality=96&proxy=1&sign=e121939f19a5845f089942f63e6da7c3&type=album")); // Расположение изображения логотипа УГАТУ
			}
			if (imageName == "Трёхстворчатое с фрамугой") {
				image = ImageIO.read(new URL("https://sun9-17.userapi.com/impg/0705RWDBeSDQrbGYrZvkp0cCQZap3a-GXkh-Bw/dYxnBhpxYZA.jpg?size=326x438&quality=96&proxy=1&sign=0dc94ff217542bc301c26d45bf7f1a66&type=album")); // Расположение изображения логотипа УГАТУ
			}
			//image = ImageIO.read(new URL("http://xn--e1afhkfagivn.xn--p1ai/svn/project23/trunk/RGR23/src/" + imageName + ".jpg")); // Расположение изображения логотипа УГАТУ
		} catch (IOException ugatu) {
			ugatu.printStackTrace();
		}
	}

	public void paint(Graphics ugatu2) {
		if (image == null)
			return;
		ugatu2.drawImage(image, 0, 0, 270, 300, null);
	}
}