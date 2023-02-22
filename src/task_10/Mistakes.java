package task_10;

/**
 * Дано предложение. Необходимо проверить его на наличие
 * ошибок в буквосочетании «жи» и «ши» и исправить их.
 */

public class Mistakes {

    public static void main(String[] args) {

        String str = "У нас жЫвут ёжик и мышЫ. Ёжик шЫпит. Жердь, Жолудь";

        char g = 'ж', G = 'Ж', sh = 'ш', SH = 'Ш';
        char i = 'и', I = 'И', y = 'ы', Y = 'Ы';

        char[] ch = str.toCharArray();

        for (int j = 0; j < ch.length; j++) {
            if (ch[j] == g || ch[j] == G || ch[j] == sh || ch[j] == SH) {
                if (ch[j + 1] == y) {
                    ch[j + 1] = i;
                } else if (ch[j + 1] == Y) {
                    ch[j + 1] = I;
                }
            }
        }

        String strFinish = toString(ch);
        System.out.println(strFinish);
    }

    public static String toString(char[] a) {
        return String.valueOf(a);
    }
}
