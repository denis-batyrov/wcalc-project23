package DRAMa;//пакет Java классов

//Импортируем библиотеки
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Объявляем класс
public class InfoButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		final JFrame main_GUI = new JFrame(); //
		main_GUI.setTitle("Разработчики проекта");
		main_GUI.setBounds(400, 220, 500, 250);
		main_GUI.setResizable(false); // Размер окна

		JPanel main_panel = new JPanel();
		main_panel.setLayout(null);
		main_GUI.add(main_panel);

//Были добавлены участники подгруппы и модератор
		JLabel moder = new JLabel("Модератор подгруппы: Батыров Денис Дамирович - 19130633 ");
		moder.setBounds(40, 10, 500, 40);
		JLabel first = new JLabel("1-й участник подгруппы: Мингареев Радмир Адикович - 19130639");
		first.setBounds(40, 40, 500, 40);
		JLabel second = new JLabel("2-й участник подгруппы: Насыров Аскар Русланович - 19130620");
		second.setBounds(40, 70, 500, 40);
		JLabel third = new JLabel("3-й участник подгруппы: Погудина Милена Константиновна - 19130635");
		third.setBounds(40, 100, 500, 40);

//Была добавлена кнопка "Назад"
		JButton button_back = new JButton("Назад");
		button_back.setBounds(370, 150, 100, 40); // Размер и расположение кнопки "назад" на окне информации
		button_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_GUI.dispose(); // Выполнение закрытия окна информации
			}
		});

		main_panel.add(button_back);
		main_panel.add(moder);
		main_panel.add(first);
		main_panel.add(second);
		main_panel.add(third);
		main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}