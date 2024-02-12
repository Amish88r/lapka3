public class OldPeople {
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_RESET = "\u001B[0m";

        String str = "\u001B[34m" + "очень очень быстро " + "\u001B[0m";
        String str1 = "\u001B[33m" + " совсем не быстро " + "\u001B[0m";
        int agge = 60;
        int min = (int) (5 + Math.random() * 56);

        public void lol(int kek) {
            if (kek > 10 / (int) (1 + Math.random() * 11)) {
                System.out.print(" Фрекен Бок не испугавшись никого, "+str1+ "прибежала, спустилась за \u001B[32m" + min + " \u001B[0m минут(ы) и плюхнулась на пол, ведь");
            } else {
                System.out.print(" Фрекен Бог, "+str+ "испугавшись, только через \u001B[33m" + min + "\u001B[0m минут(ы) поняла, что ей крышка");

            }
        }
        public void hz() {
            System.out.println(ANSI_RED + " МУЗЫКАЛЬНАЯ ПАУЗА, ЕСЛИ ВЫ ЭТО ЧИТАЕТЕ, ТО ЗНАЙТЕ, ЧТО МЕНЯ УЖЕ НЕТ В ЖИВЫХ :( " + ANSI_RESET);

        }
    }