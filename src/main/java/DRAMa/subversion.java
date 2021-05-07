package DRAMa;

//Импортируем библиотеки
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import javax.swing.*; // Библиотека для GUI (построена на основе awt)
import Math.Accessory;
import Math.Calculations;
import Math.FrameColor;
import Math.FrameMaterial;
import Math.FrameType;
import Math.GlassUnit;
import Math.OpeningMechanism;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.Color;

//Объявляем класс
public class subversion {
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	
	Map<String, Double> promos = new HashMap<String, Double>();

	public subversion() {
		JFrame main_GUI = new JFrame("subversion"); // Создание графического окна
		main_GUI.setTitle("Калькулятор стоимости производства оконных конструкций для произ. помещения");
		main_GUI.setBounds(350, 170, 620, 450);
		main_GUI.setResizable(false); // Фиксированный размер окна
		main_GUI.setBackground(Color.black);
		final Image logo = new Image();
		final JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null);
		main_GUI.add(main_panel);

		//Зона ответственности третий разработчик (user423)
		JLabel laba_info = new JLabel("Варианты створок:"); // Отображение текста или изображения
		laba_info.setBounds(15, 0, 150, 30);
		main_panel.add(laba_info);
		JLabel visota = new JLabel("Высота:"); // Отображение текста
		visota.setBounds(78, 27, 500, 30);
		main_panel.add(visota);
		JLabel shirina = new JLabel("Ширина:"); // Отображение текста
		shirina.setBounds(78, 50, 500, 30);
		main_panel.add(shirina);
		JLabel cvet = new JLabel("Цвет створок:"); // Отображение текста
		cvet.setBounds(45, 87, 500, 30);
		main_panel.add(cvet);
		JLabel meh = new JLabel("Механизм открывания:"); // Отображение текста
		meh.setBounds(15, 225, 500, 30);
		main_panel.add(meh);
		JLabel stvor1 = new JLabel("Тип открытия 1 створки:"); // Отображение текста
		stvor1.setBounds(15, 255, 500, 30);
		main_panel.add(stvor1);
		JLabel stvor2 = new JLabel("Тип открытия 2 створки:"); // Отображение текста
		stvor2.setBounds(15, 285, 500, 30);
		main_panel.add(stvor2);
		JLabel stvor3 = new JLabel("Тип открытия 3 створки:"); // Отображение текста
		stvor3.setBounds(15, 315, 500, 30);
		main_panel.add(stvor3);
		JLabel aks = new JLabel("Аксессуары:"); // Отображение текста
		aks.setBounds(48, 175, 500, 30);
		main_panel.add(aks);
		JLabel izd = new JLabel("Материал створок:"); // Отображение текста
		izd.setBounds(15, 115, 500, 30);
		main_panel.add(izd);
		JLabel steklo = new JLabel("Стеклопакет:"); // Отображение текста
		steklo.setBounds(48, 145, 500, 30);
		main_panel.add(steklo);
		JLabel promokod = new JLabel("Промокод:"); // Отображение текста
		promokod.setBounds(410, 315, 500, 30);
		main_panel.add(promokod);

		final JTextArea heightTextArea = new JTextArea("500"); // Окно для ввода высоты
		heightTextArea.setBounds(130, 34, 50, 20);
		main_panel.add(heightTextArea);
		final JTextArea widthTextArea = new JTextArea("500"); // Окно для ввода ширины
		widthTextArea.setBounds(130, 58, 50, 20);
		main_panel.add(widthTextArea);
		final JTextArea promoTextArea = new JTextArea(""); // Окно для ввода промокода
		promoTextArea.setBounds(480, 320, 110, 20);
		main_panel.add(promoTextArea);
		
		JButton button_exit = new JButton("Выход"); // Добавляем кнопку на окно
		button_exit.setBounds(170, 365, 100, 40);
		button_exit.setForeground(Color.black);
		ActionListener actionListener = new ListenerButton(); // Создаем слушатель
		button_exit.addActionListener(actionListener); // Добавляем слушатель к кнопке
		main_panel.add(button_exit);
		JButton button_info = new JButton("Об авторах"); // Кнопка вывода информации
		button_info.setBounds(470, 365, 120, 40);
		button_info.setForeground(Color.black);
		ActionListener act = new InfoButton();
		button_info.addActionListener(act);
		main_panel.add(button_info);
		JButton button_cost = new JButton("Расчёт стоимости"); // Кнопка вывода расчета
		button_cost.setBounds(10, 365, 140, 40);
		button_cost.setForeground(Color.black);
		main_panel.add(button_cost);

		String[] open1 = { // Добавление массива
				"Глухая", "Откидная", "Поворотная", "Поворотно-откидная" };
		final JComboBox<Object> type = new JComboBox<Object>(open1); // Добавление объекта комбобокса
		String[] open2 = { // Добавление массива
				"Глухая", "Откидная", "Поворотная", "Поворотно-откидная" };
		final JComboBox<Object> type2 = new JComboBox<Object>(open2); // Добавление объекта комбобокса
		String[] open3 = { // Добавление массива
				"Глухая", "Откидная", "Поворотная", "Поворотно-откидная" };
		final JComboBox<Object> type3 = new JComboBox<Object>(open3); // Добавление объекта комбобокса
		String[] transfer = { // Добавление массива
				"Одностворчатое", "Двухстворчатое", "Трёхстворчатое", "Двухстворчатое с фрамугой", "Трёхстворчатое с фрамугой" };
		final JComboBox<Object> dram = new JComboBox<Object>(transfer); // Добавление объекта комбобокса
		ActionListener dramaTransfer = new ActionListener() { // Создание слушателя
			
			public void actionPerformed(ActionEvent e) {
				String choice = (String) dram.getSelectedItem();
				logo.loadImage(choice);
				logo.setSize(500, 500);
				logo.setLocation(320, 10); // Изначальное размещение изображение
				main_panel.remove(logo);
				main_panel.add(logo);
				main_panel.setVisible(false);
				main_panel.setVisible(true);

				if (choice == "Одностворчатое") {
					type.setEnabled(true);
					type2.setEnabled(false);
					type3.setEnabled(false);
				} else if (choice == "Двухстворчатое" || choice == "Двухстворчатое с фрамугой") {
					type.setEnabled(true);
					type2.setEnabled(true);
					type3.setEnabled(false);
				} else {
					type.setEnabled(true);
					type2.setEnabled(true);
					type3.setEnabled(true);
				}
			}
		};
		
		dram.addActionListener(dramaTransfer); // Добавление слушателя к комбобоксу
		dram.setBounds(130, 7, 170, 20); // Выставление размеров окна combobox
		main_panel.add(dram); // Добавление combobox на панель
		String choice = transfer[0];
		logo.loadImage(choice);
		logo.setSize(500, 500);
		logo.setLocation(320, 10); // Изначальное размещение изображение
		main_panel.remove(logo);
		main_panel.add(logo);
		main_panel.setVisible(false);
		main_panel.setVisible(true);

		String[] color1 = { // Добавление массива
				"Бесцветный", "Цветной" };
		final JComboBox<Object> svet = new JComboBox<Object>(color1); // Добавление объекта комбобокса
		ActionListener svetColor1 = new ActionListener() { // Создание слушателя

			public void actionPerformed(ActionEvent e) {
			}
		};

		svet.addActionListener(svetColor1); // Добавление слушателя к комбобоксу
		svet.setBounds(130, 94, 170, 20); // Выставление размеров окна combobox
		main_panel.add(svet); // Добавление combobox на панель

		ActionListener typeOpen1 = new ActionListener() { // Создание слушателя
			public void actionPerformed(ActionEvent e) {
			}
		};
		type.addActionListener(typeOpen1); // Добавление слушателя к комбобоксу
		type.setBounds(160, 260, 140, 20); // Выставление размеров окна combobox
		main_panel.add(type); // Добавление combobox на панель

		ActionListener type2Open2 = new ActionListener() { // Создание слушателя
			public void actionPerformed(ActionEvent e) {
			}
		};
		type2.addActionListener(type2Open2); // Добавление слушателя к комбобоксу
		type2.setBounds(160, 290, 140, 20); // Выставление размеров окна combobox
		main_panel.add(type2); // Добавление combobox на панель

		ActionListener type3Open3 = new ActionListener() { // Создание слушателя
			public void actionPerformed(ActionEvent e) {
			}
		};
		type3.addActionListener(type3Open3); // Добавление слушателя к комбобоксу
		type3.setBounds(160, 320, 140, 20); // Выставление размеров окна combobox
		main_panel.add(type3); // Добавление combobox на панель

		String[] akses = { // Добавление массива
				"Подоконник", "Карниз", "Подоконник и карниз" };

		final JComboBox<Object> dop = new JComboBox<Object>(akses); // Добавление объекта комбобокса
		ActionListener dopAkses = new ActionListener() { // Создание слушателя
			public void actionPerformed(ActionEvent e) {
			}
		};
		dop.addActionListener(dopAkses); // Добавление слушателя к комбобоксу
		dop.setBounds(130, 180, 170, 20); // Выставление размеров окна combobox
		main_panel.add(dop); // Добавление combobox на панель

		String[] izdel = { // Добавление массива
				"ПВХ", "Дерево", "Металл" };
		final JComboBox<Object> material = new JComboBox<Object>(izdel); // Добавление объекта комбобокса
		ActionListener materialIzdel = new ActionListener() { // Создание слушателя
			public void actionPerformed(ActionEvent e) {
			}
		};
		material.addActionListener(materialIzdel); // Добавление слушателя к комбобоксу
		material.setBounds(130, 122, 170, 20); // Выставление размеров окна combobox
		main_panel.add(material); // Добавление combobox на панель

		String[] kamer = { // Добавление массива
				"Двухкамерный", "Трёхкамерный" };
		final JComboBox<Object> kolvo = new JComboBox<Object>(kamer); // Добавление объекта комбобокса
		ActionListener kolvoKamer = new ActionListener() { // Создание слушателя
			public void actionPerformed(ActionEvent e) {
			}
		};
		kolvo.addActionListener(kolvoKamer); // Добавление слушателя к комбобоксу
		kolvo.setBounds(130, 150, 170, 20); // Выставление размеров окна combobox
		main_panel.add(kolvo); // Добавление combobox на панель
		main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener price = new ActionListener() { // Создание слушателя
			public void actionPerformed(ActionEvent e) {
				// Проверка на ввод некорректных символов и вывод ошибки пользователю 
				int height, width;
				try {
				height = Integer.parseInt(heightTextArea.getText());
				width = Integer.parseInt(widthTextArea.getText());
				} catch (Exception error) {
				System.out.print("Введите правильные размеры створки");
				JOptionPane.showMessageDialog(null, "Введите корректные размеры створки!\n "
				+ "\nМинимальное значение высоты: 500 мм\nМаксимальное значение высоты: 1800 мм"
				+ "\nМинимальное значение ширины: 500 мм\nМаксимальное значение ширины: 3000 мм");
				}
				// Проверка на ввод ограничений и вывод ошибки пользователю 
				height = Integer.parseInt(heightTextArea.getText());
				width = Integer.parseInt(widthTextArea.getText());
				if (height > 1800 || height < 500 || width > 3000 || width < 500) {
				System.out.print("Введите правильные размеры створки");
				JOptionPane.showMessageDialog(null, "Введите корректные размеры створки!\n "
				+ "\nМинимальное значение высоты: 500 мм\nМаксимальное значение высоты: 1800 мм"
				+ "\nМинимальное значение ширины: 500 мм\nМаксимальное значение ширины: 3000 мм");
				return;
				}
				// Перевод строкового значение в цифры для дальнейшего расчета
				FrameColor frameColor = FrameColor.fromString(svet.getSelectedItem().toString());
				GlassUnit glassUnit = GlassUnit.fromString(kolvo.getSelectedItem().toString());
				Accessory accessory = Accessory.fromString(dop.getSelectedItem().toString());
				FrameType frametype = FrameType.fromString(dram.getSelectedItem().toString());
				FrameMaterial frameMaterial = FrameMaterial.fromString(material.getSelectedItem().toString());
				OpeningMechanism first = OpeningMechanism.fromString(type.getSelectedItem().toString());
				OpeningMechanism second = OpeningMechanism.fromString(type2.getSelectedItem().toString());
				OpeningMechanism third = OpeningMechanism.fromString(type3.getSelectedItem().toString());
				
				Double discountValue = promos.get(promoTextArea.getText());
				double discount = discountValue == null ? 1 : discountValue;
				// Для провеки некорректных значений комбобоксов
				if (frametype == null) {
					return;
				}
				// Возвращение значений из комбобоксов
				if (frameMaterial == null) {
					return;
				}
				List<OpeningMechanism> mechanisms = new ArrayList<OpeningMechanism>();
				if (frametype == FrameType.SINGLELEAF) {
					if (first == null) {
						return;
					}
					mechanisms.add(first);
				} else if (frametype == FrameType.BIVALVE || frametype == FrameType.BIVALVETRANSOM) {
					if (first == null || second == null) {
						return;
					}
					mechanisms.add(first);
					mechanisms.add(second);
				} else {
					if (first == null || second == null || third == null) {
						return;
					}
					mechanisms.add(first);
					mechanisms.add(second);
					mechanisms.add(third);
				}
				if (frameColor == null) {
					return;
				}
				if (glassUnit == null) {
					return;
				}
				if (accessory == null) {
					return;
				}
				
				double frameCost = Calculations.getWindowFrameCost(height, width, frametype, frameMaterial);
				double leafescost = Calculations.getLeafCost(mechanisms);
				double glassCost = Calculations.getGlassUnitCost(height, width, glassUnit);
				double accCost = Calculations.getAccessoriesCost(width, accessory);
				double fullCost = Calculations.getResultSum(frameCost, leafescost, glassCost, accCost, frameColor, discount);
				System.out.println(fullCost);
				
				final JFrame main_GUI = new JFrame(); // Создание нового окна
				main_GUI.setTitle("Расчет стоимости"); 
				main_GUI.setBounds(400, 400, 300, 120);
				main_GUI.setResizable(false); 
				JPanel resultPanel = new JPanel();
				main_panel.setLayout(null);
				main_GUI.add(resultPanel);
				JLabel moder = new JLabel("Итоговая стоимость составит " + fullCost + "р"); // Добавление надписи
				moder.setBounds(40, 10, 500, 40);
	
				JButton button_back = new JButton("Закрыть"); // Добавление кнопки "закрыть"
				button_back.setBounds(370, 150, 100, 40); // Размер и расположение кнопки "закрыть"
				button_back.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						main_GUI.dispose(); // Выполнение закрытия окна расчета
					}
				});
				resultPanel.add(moder);
				resultPanel.add(button_back);
				main_GUI.setVisible(true);
				main_GUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		};
		button_cost.addActionListener(price);
		
		promos.put("drama_5", 0.95); // Ввод промокода на 5%
		promos.put("drama_10", 0.9); // Ввод промокода на 10%
		
		type.setSelectedIndex(0);
		type2.setSelectedIndex(0);
		type3.setSelectedIndex(0);
		dram.setSelectedIndex(0);
		svet.setSelectedIndex(0);
		material.setSelectedIndex(0);
		kolvo.setSelectedIndex(0);
		dop.setSelectedIndex(0);
	}
		
		// Закрытие окна JFrame и процесса Java
		public static void main(String[] args) {
			new subversion();
		}

		public int fullCost() {
			// TODO Auto-generated method stub
			return 0;
		}

		public int frameCost() {
			// TODO Auto-generated method stub
			return 0;
		}
	}