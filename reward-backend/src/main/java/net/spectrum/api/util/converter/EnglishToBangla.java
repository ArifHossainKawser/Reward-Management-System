package net.spectrum.api.util.converter;

public class EnglishToBangla {
    private static final char[] banglaDigits = {'০', '১', '২', '৩', '৪', '৫', '৬', '৭', '৮', '৯'};
    private static final char[] englishDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static final String getDigitBanglaFromEnglish(String number) {
        if (number == null) {
            return new String("");
        }
        StringBuilder builder = new StringBuilder();
        try {
            for (int i = 0; i < number.length(); i++) {
                if (Character.isDigit(number.charAt(i))) {
                    if (((int) (number.charAt(i)) - 48) <= 9) {
                        builder.append(banglaDigits[(int) (number.charAt(i)) - 48]);
                    } else {
                        builder.append(number.charAt(i));
                    }
                } else {
                    builder.append(number.charAt(i));
                }
            }
        } catch (Exception e) {
            return new String("");
        }
        return builder.toString();
    }
}
