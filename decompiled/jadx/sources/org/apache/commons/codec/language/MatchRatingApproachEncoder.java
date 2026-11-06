package org.apache.commons.codec.language;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.deecomms.remoteConfig.ArcusConfig;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class MatchRatingApproachEncoder implements StringEncoder {
    private static final String[] DOUBLE_CONSONANT = {"BB", "CC", "DD", "FF", "GG", "HH", "JJ", "KK", "LL", LocaleUnitResolver.ImperialCountryCode.MYANMAR, "NN", "PP", "QQ", "RR", "SS", "TT", "VV", "WW", "XX", "YY", "ZZ"};
    private static final int ELEVEN = 11;
    private static final String EMPTY = "";
    private static final int FIVE = 5;
    private static final int FOUR = 4;
    private static final int ONE = 1;
    private static final String PLAIN_ASCII = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu";
    private static final int SEVEN = 7;
    private static final int SIX = 6;
    private static final String SPACE = " ";
    private static final int THREE = 3;
    private static final int TWELVE = 12;
    private static final int TWO = 2;
    private static final String UNICODE = "ÀàÈèÌìÒòÙùÁáÉéÍíÓóÚúÝýÂâÊêÎîÔôÛûŶŷÃãÕõÑñÄäËëÏïÖöÜüŸÿÅåÇçŐőŰű";

    public String cleanName(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        String[] strArr = {"\\-", "[&]", "\\'", ArcusConfig.PATH_SEPARATOR, "[\\,]"};
        for (int i = 0; i < 5; i++) {
            upperCase = upperCase.replaceAll(strArr[i], "");
        }
        return removeAccents(upperCase).replaceAll("\\s+", "");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public final String encode(String str) {
        return (str == null || "".equalsIgnoreCase(str) || " ".equalsIgnoreCase(str) || str.length() == 1) ? "" : getFirst3Last3(removeDoubleConsonants(removeVowels(cleanName(str))));
    }

    public String getFirst3Last3(String str) {
        int length = str.length();
        return length > 6 ? str.substring(0, 3).concat(str.substring(length - 3, length)) : str;
    }

    public int getMinRating(int i) {
        if (i <= 4) {
            return 5;
        }
        if (i <= 7) {
            return 4;
        }
        if (i <= 11) {
            return 3;
        }
        return i == 12 ? 2 : 1;
    }

    public boolean isEncodeEquals(String str, String str2) {
        if (str != null && !"".equalsIgnoreCase(str) && !" ".equalsIgnoreCase(str) && str2 != null && !"".equalsIgnoreCase(str2) && !" ".equalsIgnoreCase(str2) && str.length() != 1 && str2.length() != 1) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
            String cleanName = cleanName(str);
            String cleanName2 = cleanName(str2);
            String removeVowels = removeVowels(cleanName);
            String removeVowels2 = removeVowels(cleanName2);
            String removeDoubleConsonants = removeDoubleConsonants(removeVowels);
            String removeDoubleConsonants2 = removeDoubleConsonants(removeVowels2);
            String first3Last3 = getFirst3Last3(removeDoubleConsonants);
            String first3Last32 = getFirst3Last3(removeDoubleConsonants2);
            if (Math.abs(first3Last3.length() - first3Last32.length()) >= 3) {
                return false;
            }
            if (leftToRightThenRightToLeftProcessing(first3Last3, first3Last32) >= getMinRating(Math.abs(first3Last32.length() + first3Last3.length()))) {
                return true;
            }
        }
        return false;
    }

    public boolean isVowel(String str) {
        return str.equalsIgnoreCase(ExifInterface.LONGITUDE_EAST) || str.equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) || str.equalsIgnoreCase("O") || str.equalsIgnoreCase("I") || str.equalsIgnoreCase("U");
    }

    public int leftToRightThenRightToLeftProcessing(String str, String str2) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        int i = 0;
        while (i < charArray.length && i <= length2) {
            int i2 = i + 1;
            String substring = str.substring(i, i2);
            int i3 = length - i;
            String substring2 = str.substring(i3, i3 + 1);
            String substring3 = str2.substring(i, i2);
            int i4 = length2 - i;
            String substring4 = str2.substring(i4, i4 + 1);
            if (substring.equals(substring3)) {
                charArray[i] = ' ';
                charArray2[i] = ' ';
            }
            if (substring2.equals(substring4)) {
                charArray[i3] = ' ';
                charArray2[i4] = ' ';
            }
            i = i2;
        }
        String replaceAll = new String(charArray).replaceAll("\\s+", "");
        String replaceAll2 = new String(charArray2).replaceAll("\\s+", "");
        return replaceAll.length() > replaceAll2.length() ? Math.abs(6 - replaceAll.length()) : Math.abs(6 - replaceAll2.length());
    }

    public String removeAccents(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int indexOf = UNICODE.indexOf(charAt);
            if (indexOf > -1) {
                sb.append(PLAIN_ASCII.charAt(indexOf));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public String removeDoubleConsonants(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        for (String str2 : DOUBLE_CONSONANT) {
            if (upperCase.contains(str2)) {
                upperCase = upperCase.replace(str2, str2.substring(0, 1));
            }
        }
        return upperCase;
    }

    public String removeVowels(String str) {
        String substring = str.substring(0, 1);
        String replaceAll = str.replaceAll(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "").replaceAll(ExifInterface.LONGITUDE_EAST, "").replaceAll("I", "").replaceAll("O", "").replaceAll("U", "").replaceAll("\\s{2,}\\b", " ");
        return isVowel(substring) ? BitVector$$ExternalSyntheticOutline0.m(substring, replaceAll) : replaceAll;
    }

    @Override // org.apache.commons.codec.Encoder
    public final Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
    }
}
