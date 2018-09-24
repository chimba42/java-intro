package lesson2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


    public class HomeWork {
        public static void main(String[] args)  {
            String word = getWordFromConsole();
            int n = getNumberFromConsole();
            System.out.println("every '" + n + "' char of word:'" + word + "' is:" + "\n" + everyNth(word, n));

        }

        public static String getWordFromConsole() {
            String word = null;
            boolean success = false;
            System.out.println("Enter Your Word:");
            while (!success) {
                //Enter data using BufferReader
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    // Reading data using readLine
                    word = reader.readLine();
                } catch (Exception ex) {
                    System.out.println("Can't read:" + ex.getMessage());
                    System.out.println("Please try again:");
                }
                Pattern p = Pattern.compile("[^\\t\\f\\r\\n]");
                Matcher m = p.matcher(word);
                if (null == word && word.isEmpty()) {
                    System.out.println("Word cannot be empty, try again:");
                } else {
                    if (m.find()) {
                        success = true;
                    } else {
                        System.out.println("Word contains not supported symbols, try again:");
                    }
                }
            }
            return word;
        };

        public static int getNumberFromConsole() {
            int n = 0;
            boolean success = false;
            System.out.println("Please write N (n must be > 0):");
            while (!success) {
                //Enter data using BufferReader
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    // Reading data using readLine
                    n = Integer.parseInt(reader.readLine());
                } catch (Exception ex) {
                    System.out.println("Can't read number:" + ex.getMessage());
                    System.out.println("Please try again:");
                }
                if (n <= 0) {
                    System.out.println("Please write n > 0:");
                } else {
                    success = true;
                }
            }
            return n;
        }

        //сам метод, що приймає стрінгу і інт на вході, а повертає тип String
        public static String everyNth(String str, int n) {
            //передамо параметри в метод для валідаціі, щоб перевірити вхідні дані на корректність
            validateInput(str, n);// ідемо далі якщо всі дані-гуд, інакше отримаємо помилку, що дані не корректні

            int i = 0;// це наш ітератор "тобто показник позиції" саме таку і-ту букву ми будемо "викорчовучати" із строки
            //стрінгбілдер це штука яка конкатеную строки, почитай за цю тему
            //набагато краще ніж просте конкатування строк: строка1+строка2
            StringBuilder sb = new StringBuilder();

            //ми будемо видирати і-тий символ з строки (відлік починається з 0), а потім збільшимо і на н,
            // таким чином ми видеремо 0-вий символ, потім 0+н символ потім 0+н+н символ і тд
            //отже ми будемо інтрементити(збільшувати і на н), доки це матиме сенс,
            // а сенс є тдоки виконується умова i<str.length(), я якщо із строки із семи символі спробувати
            // дістати сьомий символ отримаємо помилку
            //памятаємо що символи в строці із семи символі абцдежзи, індексуються з 0, тобто а на 0 місці,
            // б на 1 і тд
            while (i < str.length()) {
                //str.charAt(i) це взяти символ що знаходиться на і місці(починається з 0)
                sb.append(str.charAt(i)); // sb.append це типу додати до того що є в стрінг білдері те що ми
                // передаємо в аргументі, в нашому випадку символ взятий методом str.charAt(i)
                i += n;//рівносильно і=і+n
                //тобто взявши з самого початку 0 символ і збільшуємо на н щоб якщо i<str.length() взяти
                // на наступному заході н-символ , а потім і збільшити ще на н тобто і=0+н+н якщо i<str.length()
                // взяти 0+н+н символ і тд
            }
            return sb.toString(); // після того як ми зібрали кожний н симфол із строки в стрінгбілде ми
            // кажемо йому а ну віддай все що ми в тебе поклали і він повертає строку, яка складається із
            // символа на 0 позиціі на н позиції на 2н позиціїї і тд
        }

        //метод для валідації параметрів так сказати тест на дурня, якщо ти пихатимеш якісь ліві параметри в метод



        private static void validateInput(String str, int n) {
            //іф перевіря чи стр не нулл і не пуста, інакше кидаємо помилку
            if (null == str && str.isEmpty()) {
                throw new IllegalArgumentException("str cannot be empty");
            }
            //іф кидає помилку, якщо н меньше або дорівнює 0
            if (n <= 0) {
                throw new IllegalArgumentException("n must be > 0");
            }
        }
    }



