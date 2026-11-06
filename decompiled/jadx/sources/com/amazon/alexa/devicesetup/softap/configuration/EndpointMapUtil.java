package com.amazon.alexa.devicesetup.softap.configuration;

import com.amazon.alexa.biloba.utils.WebConstants;
import com.amazon.alexa.marketplace.api.CountryCode;
import com.amazon.deecomms.common.Constants;
import com.amazon.tarazed.logging.TarazedLogFormatter;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.objectweb.asm.signature.SignatureVisitor;
import org.openjdk.tools.javac.jvm.ByteCodes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class EndpointMapUtil {
    private EndpointMapUtil() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static CountryCode countryCodeToUse(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2064598270:
                if (str.equals("https://projectdee-ui-au.aka.amazon.com")) {
                    c = 0;
                    break;
                }
                break;
            case -2032197224:
                if (str.equals("https://projectdee-ui-ca.aka.amazon.com")) {
                    c = 1;
                    break;
                }
                break;
            case -2031614928:
                if (str.equals("https://eu-api-alexa-gamma.amazon.co.jp")) {
                    c = 2;
                    break;
                }
                break;
            case -2031614592:
                if (str.equals("https://eu-api-alexa-gamma.amazon.co.uk")) {
                    c = 3;
                    break;
                }
                break;
            case -2000520962:
                if (str.equals("https://projectdee-ui-gamma.amazon.com.au")) {
                    c = 4;
                    break;
                }
                break;
            case -2000520934:
                if (str.equals("https://projectdee-ui-gamma.amazon.com.br")) {
                    c = 5;
                    break;
                }
                break;
            case -2000520587:
                if (str.equals("https://projectdee-ui-gamma.amazon.com.mx")) {
                    c = 6;
                    break;
                }
                break;
            case -1881670040:
                if (str.equals("https://fe-api-alexa-gamma.amazon.com.au")) {
                    c = 7;
                    break;
                }
                break;
            case -1881670012:
                if (str.equals("https://fe-api-alexa-gamma.amazon.com.br")) {
                    c = '\b';
                    break;
                }
                break;
            case -1881669665:
                if (str.equals("https://fe-api-alexa-gamma.amazon.com.mx")) {
                    c = '\t';
                    break;
                }
                break;
            case -1865367791:
                if (str.equals("https://alexa.amazon.com.au")) {
                    c = '\n';
                    break;
                }
                break;
            case -1865367763:
                if (str.equals("https://alexa.amazon.com.br")) {
                    c = 11;
                    break;
                }
                break;
            case -1865367416:
                if (str.equals("https://alexa.amazon.com.mx")) {
                    c = '\f';
                    break;
                }
                break;
            case -1861873023:
                if (str.equals("https://fe-api-alexa-gamma.amazon.co.jp")) {
                    c = '\r';
                    break;
                }
                break;
            case -1861872687:
                if (str.equals("https://fe-api-alexa-gamma.amazon.co.uk")) {
                    c = 14;
                    break;
                }
                break;
            case -1861347144:
                if (str.equals("https://alexa.amazon.co.jp")) {
                    c = 15;
                    break;
                }
                break;
            case -1861346808:
                if (str.equals("https://alexa.amazon.co.uk")) {
                    c = 16;
                    break;
                }
                break;
            case -1849191068:
                if (str.equals(WebConstants.Endpoints.GAMMA_ENDPOINT)) {
                    c = 17;
                    break;
                }
                break;
            case -1750443798:
                if (str.equals("https://na-api-alexa-preprod.aka.amazon.com")) {
                    c = 18;
                    break;
                }
                break;
            case -1555782719:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.ca")) {
                    c = 19;
                    break;
                }
                break;
            case -1555782684:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.de")) {
                    c = 20;
                    break;
                }
                break;
            case -1555782639:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.es")) {
                    c = 21;
                    break;
                }
                break;
            case -1555782609:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.fr")) {
                    c = 22;
                    break;
                }
                break;
            case -1555782520:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.in")) {
                    c = 23;
                    break;
                }
                break;
            case -1555782514:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.it")) {
                    c = 24;
                    break;
                }
                break;
            case -1555782367:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.nl")) {
                    c = 25;
                    break;
                }
                break;
            case -1555782234:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.ru")) {
                    c = 26;
                    break;
                }
                break;
            case -1433775075:
                if (str.equals("https://na-api-alexa-gamma.aka.amazon.com")) {
                    c = 27;
                    break;
                }
                break;
            case -1424459909:
                if (str.equals("https://projectdee-ui-gb.aka.amazon.com")) {
                    c = TarazedLogFormatter.FILE_SEPARATOR;
                    break;
                }
                break;
            case -1413793147:
                if (str.equals("https://fe-api-alexa-gamma.amazon.ca")) {
                    c = 29;
                    break;
                }
                break;
            case -1413793112:
                if (str.equals("https://fe-api-alexa-gamma.amazon.de")) {
                    c = 30;
                    break;
                }
                break;
            case -1413793067:
                if (str.equals("https://fe-api-alexa-gamma.amazon.es")) {
                    c = 31;
                    break;
                }
                break;
            case -1413793037:
                if (str.equals("https://fe-api-alexa-gamma.amazon.fr")) {
                    c = ' ';
                    break;
                }
                break;
            case -1413792948:
                if (str.equals("https://fe-api-alexa-gamma.amazon.in")) {
                    c = '!';
                    break;
                }
                break;
            case -1413792942:
                if (str.equals("https://fe-api-alexa-gamma.amazon.it")) {
                    c = '\"';
                    break;
                }
                break;
            case -1413792795:
                if (str.equals("https://fe-api-alexa-gamma.amazon.nl")) {
                    c = '#';
                    break;
                }
                break;
            case -1351601096:
                if (str.equals("https://projectdee-ui-nl.aka.amazon.com")) {
                    c = '$';
                    break;
                }
                break;
            case -1330425915:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.co.jp")) {
                    c = '%';
                    break;
                }
                break;
            case -1330425579:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.co.uk")) {
                    c = Typography.amp;
                    break;
                }
                break;
            case -1235494500:
                if (str.equals("https://eu-api-alexa.amazon.ca")) {
                    c = '\'';
                    break;
                }
                break;
            case -1235494465:
                if (str.equals("https://eu-api-alexa.amazon.de")) {
                    c = '(';
                    break;
                }
                break;
            case -1235494420:
                if (str.equals("https://eu-api-alexa.amazon.es")) {
                    c = ')';
                    break;
                }
                break;
            case -1235494390:
                if (str.equals("https://eu-api-alexa.amazon.fr")) {
                    c = '*';
                    break;
                }
                break;
            case -1235494301:
                if (str.equals("https://eu-api-alexa.amazon.in")) {
                    c = SignatureVisitor.EXTENDS;
                    break;
                }
                break;
            case -1235494295:
                if (str.equals("https://eu-api-alexa.amazon.it")) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case -1235494148:
                if (str.equals("https://eu-api-alexa.amazon.nl")) {
                    c = '-';
                    break;
                }
                break;
            case -984623490:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.com")) {
                    c = '.';
                    break;
                }
                break;
            case -919395838:
                if (str.equals("https://na-api-alexa.amazon.com.au")) {
                    c = '/';
                    break;
                }
                break;
            case -919395810:
                if (str.equals("https://na-api-alexa.amazon.com.br")) {
                    c = '0';
                    break;
                }
                break;
            case -919395463:
                if (str.equals("https://na-api-alexa.amazon.com.mx")) {
                    c = '1';
                    break;
                }
                break;
            case -886457074:
                if (str.equals("https://fe-api-alexa.amazon.com.au")) {
                    c = '2';
                    break;
                }
                break;
            case -886457046:
                if (str.equals("https://fe-api-alexa.amazon.com.br")) {
                    c = '3';
                    break;
                }
                break;
            case -886456699:
                if (str.equals("https://fe-api-alexa.amazon.com.mx")) {
                    c = '4';
                    break;
                }
                break;
            case -794920422:
                if (str.equals("https://na-api-alexa-preprod.amazon.co.jp")) {
                    c = '5';
                    break;
                }
                break;
            case -794920086:
                if (str.equals("https://na-api-alexa-preprod.amazon.co.uk")) {
                    c = '6';
                    break;
                }
                break;
            case -594709615:
                if (str.equals("https://fe-api-alexa-gamma.aka.amazon.com")) {
                    c = '7';
                    break;
                }
                break;
            case -549283343:
                if (str.equals("https://projectdee-ui-in.aka.amazon.com")) {
                    c = '8';
                    break;
                }
                break;
            case -533169901:
                if (str.equals("https://projectdee-ui-ru.aka.amazon.com")) {
                    c = '9';
                    break;
                }
                break;
            case -507923072:
                if (str.equals("https://eu-api-alexa-gamma.aka.amazon.com")) {
                    c = AbstractJsonLexerKt.COLON;
                    break;
                }
                break;
            case -277301330:
                if (str.equals("https://alexa.amazon.ca")) {
                    c = ';';
                    break;
                }
                break;
            case -277301295:
                if (str.equals("https://alexa.amazon.de")) {
                    c = Typography.less;
                    break;
                }
                break;
            case -277301250:
                if (str.equals("https://alexa.amazon.es")) {
                    c = '=';
                    break;
                }
                break;
            case -277301220:
                if (str.equals("https://alexa.amazon.fr")) {
                    c = Typography.greater;
                    break;
                }
                break;
            case -277301131:
                if (str.equals("https://alexa.amazon.in")) {
                    c = Constants.DEFAULT_IMAGE_CHAR;
                    break;
                }
                break;
            case -277301125:
                if (str.equals("https://alexa.amazon.it")) {
                    c = '@';
                    break;
                }
                break;
            case -277300978:
                if (str.equals("https://alexa.amazon.nl")) {
                    c = 'A';
                    break;
                }
                break;
            case -277300845:
                if (str.equals("https://alexa.amazon.ru")) {
                    c = 'B';
                    break;
                }
                break;
            case -241386325:
                if (str.equals("https://projectdee-ui-mx.aka.amazon.com")) {
                    c = 'C';
                    break;
                }
                break;
            case -217042000:
                if (str.equals("https://projectdee-ui-jp.aka.amazon.com")) {
                    c = 'D';
                    break;
                }
                break;
            case -151696556:
                if (str.equals("https://fe-api-alexa.amazon.com")) {
                    c = 'E';
                    break;
                }
                break;
            case -6406095:
                if (str.equals(WebConstants.Endpoints.PROD_ENDPOINT)) {
                    c = 'F';
                    break;
                }
                break;
            case 74741576:
                if (str.equals("https://projectdee-ui-es.aka.amazon.com")) {
                    c = 'G';
                    break;
                }
                break;
            case 165192076:
                if (str.equals("https://na-api-alexa-preprod.amazon.ca")) {
                    c = 'H';
                    break;
                }
                break;
            case 165192111:
                if (str.equals("https://na-api-alexa-preprod.amazon.de")) {
                    c = 'I';
                    break;
                }
                break;
            case 165192156:
                if (str.equals("https://na-api-alexa-preprod.amazon.es")) {
                    c = 'J';
                    break;
                }
                break;
            case 165192186:
                if (str.equals("https://na-api-alexa-preprod.amazon.fr")) {
                    c = 'K';
                    break;
                }
                break;
            case 165192275:
                if (str.equals("https://na-api-alexa-preprod.amazon.in")) {
                    c = Matrix.MATRIX_TYPE_RANDOM_LT;
                    break;
                }
                break;
            case 165192281:
                if (str.equals("https://na-api-alexa-preprod.amazon.it")) {
                    c = 'M';
                    break;
                }
                break;
            case 165192428:
                if (str.equals("https://na-api-alexa-preprod.amazon.nl")) {
                    c = 'N';
                    break;
                }
                break;
            case 206911999:
                if (str.equals("https://eu-api-alexa.amazon.com.au")) {
                    c = 'O';
                    break;
                }
                break;
            case 206912027:
                if (str.equals("https://eu-api-alexa.amazon.com.br")) {
                    c = 'P';
                    break;
                }
                break;
            case 206912374:
                if (str.equals("https://eu-api-alexa.amazon.com.mx")) {
                    c = 'Q';
                    break;
                }
                break;
            case 248440603:
                if (str.equals("https://fe-api-alexa.amazon.co.jp")) {
                    c = Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                    break;
                }
                break;
            case 248440939:
                if (str.equals("https://fe-api-alexa.amazon.co.uk")) {
                    c = 'S';
                    break;
                }
                break;
            case 354376707:
                if (str.equals("https://eu-api-alexa.amazon.com")) {
                    c = 'T';
                    break;
                }
                break;
            case 682478891:
                if (str.equals("https://projectdee-ui-it.aka.amazon.com")) {
                    c = Matrix.MATRIX_TYPE_RANDOM_UT;
                    break;
                }
                break;
            case 778775264:
                if (str.equals("https://na-api-alexa.amazon.com")) {
                    c = 'V';
                    break;
                }
                break;
            case 820313958:
                if (str.equals("https://projectdee-ui-br.aka.amazon.com")) {
                    c = 'W';
                    break;
                }
                break;
            case 834685269:
                if (str.equals("https://projectdee-ui.aka.amazon.com")) {
                    c = 'X';
                    break;
                }
                break;
            case 899261965:
                if (str.equals("https://na-api-alexa-gamma.amazon.co.jp")) {
                    c = 'Y';
                    break;
                }
                break;
            case 899262301:
                if (str.equals("https://na-api-alexa-gamma.amazon.co.uk")) {
                    c = Matrix.MATRIX_TYPE_ZERO;
                    break;
                }
                break;
            case 1043787051:
                if (str.equals("https://projectdee-ui-gamma.amazon.co.jp")) {
                    c = AbstractJsonLexerKt.BEGIN_LIST;
                    break;
                }
                break;
            case 1043787387:
                if (str.equals("https://projectdee-ui-gamma.amazon.co.uk")) {
                    c = '\\';
                    break;
                }
                break;
            case 1078662055:
                if (str.equals("https://na-api-alexa.amazon.co.jp")) {
                    c = AbstractJsonLexerKt.END_LIST;
                    break;
                }
                break;
            case 1078662391:
                if (str.equals("https://na-api-alexa.amazon.co.uk")) {
                    c = '^';
                    break;
                }
                break;
            case 1129089519:
                if (str.equals("https://na-api-alexa-preprod.amazon.com.au")) {
                    c = '_';
                    break;
                }
                break;
            case 1129089547:
                if (str.equals("https://na-api-alexa-preprod.amazon.com.br")) {
                    c = '`';
                    break;
                }
                break;
            case 1129089894:
                if (str.equals("https://na-api-alexa-preprod.amazon.com.mx")) {
                    c = 'a';
                    break;
                }
                break;
            case 1253541898:
                if (str.equals("https://eu-api-alexa.amazon.co.jp")) {
                    c = 'b';
                    break;
                }
                break;
            case 1253542234:
                if (str.equals("https://eu-api-alexa.amazon.co.uk")) {
                    c = 'c';
                    break;
                }
                break;
            case 1291793017:
                if (str.equals("https://na-api-alexa-gamma.amazon.ca")) {
                    c = 'd';
                    break;
                }
                break;
            case 1291793052:
                if (str.equals("https://na-api-alexa-gamma.amazon.de")) {
                    c = 'e';
                    break;
                }
                break;
            case 1291793097:
                if (str.equals("https://na-api-alexa-gamma.amazon.es")) {
                    c = 'f';
                    break;
                }
                break;
            case 1291793127:
                if (str.equals("https://na-api-alexa-gamma.amazon.fr")) {
                    c = 'g';
                    break;
                }
                break;
            case 1291793216:
                if (str.equals("https://na-api-alexa-gamma.amazon.in")) {
                    c = 'h';
                    break;
                }
                break;
            case 1291793222:
                if (str.equals("https://na-api-alexa-gamma.amazon.it")) {
                    c = 'i';
                    break;
                }
                break;
            case 1291793369:
                if (str.equals("https://na-api-alexa-gamma.amazon.nl")) {
                    c = 'j';
                    break;
                }
                break;
            case 1325821979:
                if (str.equals("https://projectdee-ui-gamma.amazon.ca")) {
                    c = 'k';
                    break;
                }
                break;
            case 1325822014:
                if (str.equals("https://projectdee-ui-gamma.amazon.de")) {
                    c = 'l';
                    break;
                }
                break;
            case 1325822059:
                if (str.equals("https://projectdee-ui-gamma.amazon.es")) {
                    c = 'm';
                    break;
                }
                break;
            case 1325822089:
                if (str.equals("https://projectdee-ui-gamma.amazon.fr")) {
                    c = 'n';
                    break;
                }
                break;
            case 1325822178:
                if (str.equals("https://projectdee-ui-gamma.amazon.in")) {
                    c = 'o';
                    break;
                }
                break;
            case 1325822184:
                if (str.equals("https://projectdee-ui-gamma.amazon.it")) {
                    c = 'p';
                    break;
                }
                break;
            case 1325822331:
                if (str.equals("https://projectdee-ui-gamma.amazon.nl")) {
                    c = 'q';
                    break;
                }
                break;
            case 1325822464:
                if (str.equals("https://projectdee-ui-gamma.amazon.ru")) {
                    c = 'r';
                    break;
                }
                break;
            case 1341865782:
                if (str.equals("https://eu-api-alexa-gamma.amazon.ca")) {
                    c = 's';
                    break;
                }
                break;
            case 1341865817:
                if (str.equals("https://eu-api-alexa-gamma.amazon.de")) {
                    c = 't';
                    break;
                }
                break;
            case 1341865862:
                if (str.equals("https://eu-api-alexa-gamma.amazon.es")) {
                    c = AbstractJsonLexerKt.UNICODE_ESC;
                    break;
                }
                break;
            case 1341865892:
                if (str.equals("https://eu-api-alexa-gamma.amazon.fr")) {
                    c = 'v';
                    break;
                }
                break;
            case 1341865981:
                if (str.equals("https://eu-api-alexa-gamma.amazon.in")) {
                    c = 'w';
                    break;
                }
                break;
            case 1341865987:
                if (str.equals("https://eu-api-alexa-gamma.amazon.it")) {
                    c = 'x';
                    break;
                }
                break;
            case 1341866134:
                if (str.equals("https://eu-api-alexa-gamma.amazon.nl")) {
                    c = 'y';
                    break;
                }
                break;
            case 1446265497:
                if (str.equals("https://eu-api-alexa-gamma.amazon.com.au")) {
                    c = 'z';
                    break;
                }
                break;
            case 1446265525:
                if (str.equals("https://eu-api-alexa-gamma.amazon.com.br")) {
                    c = AbstractJsonLexerKt.BEGIN_OBJ;
                    break;
                }
                break;
            case 1446265872:
                if (str.equals("https://eu-api-alexa-gamma.amazon.com.mx")) {
                    c = '|';
                    break;
                }
                break;
            case 1573943061:
                if (str.equals("https://projectdee-ui-de.aka.amazon.com")) {
                    c = AbstractJsonLexerKt.END_OBJ;
                    break;
                }
                break;
            case 1708288420:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.com.au")) {
                    c = JsonPointer.ESC;
                    break;
                }
                break;
            case 1708288448:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.com.br")) {
                    c = 127;
                    break;
                }
                break;
            case 1708288795:
                if (str.equals("https://projectdee-ui-pre-prod.amazon.com.mx")) {
                    c = 128;
                    break;
                }
                break;
            case 1845546931:
                if (str.equals("https://projectdee-ui-dev.integ.amazon.com")) {
                    c = 129;
                    break;
                }
                break;
            case 1934769195:
                if (str.equals("https://fe-api-alexa.amazon.ca")) {
                    c = 130;
                    break;
                }
                break;
            case 1934769230:
                if (str.equals("https://fe-api-alexa.amazon.de")) {
                    c = 131;
                    break;
                }
                break;
            case 1934769275:
                if (str.equals("https://fe-api-alexa.amazon.es")) {
                    c = 132;
                    break;
                }
                break;
            case 1934769305:
                if (str.equals("https://fe-api-alexa.amazon.fr")) {
                    c = 133;
                    break;
                }
                break;
            case 1934769394:
                if (str.equals("https://fe-api-alexa.amazon.in")) {
                    c = 134;
                    break;
                }
                break;
            case 1934769400:
                if (str.equals("https://fe-api-alexa.amazon.it")) {
                    c = 135;
                    break;
                }
                break;
            case 1934769547:
                if (str.equals("https://fe-api-alexa.amazon.nl")) {
                    c = 136;
                    break;
                }
                break;
            case 1938585450:
                if (str.equals("https://projectdee-ui-fr.aka.amazon.com")) {
                    c = 137;
                    break;
                }
                break;
            case 1964784415:
                if (str.equals("https://na-api-alexa.amazon.ca")) {
                    c = 138;
                    break;
                }
                break;
            case 1964784450:
                if (str.equals("https://na-api-alexa.amazon.de")) {
                    c = 139;
                    break;
                }
                break;
            case 1964784495:
                if (str.equals("https://na-api-alexa.amazon.es")) {
                    c = 140;
                    break;
                }
                break;
            case 1964784525:
                if (str.equals("https://na-api-alexa.amazon.fr")) {
                    c = 141;
                    break;
                }
                break;
            case 1964784614:
                if (str.equals("https://na-api-alexa.amazon.in")) {
                    c = 142;
                    break;
                }
                break;
            case 1964784620:
                if (str.equals("https://na-api-alexa.amazon.it")) {
                    c = 143;
                    break;
                }
                break;
            case 1964784767:
                if (str.equals("https://na-api-alexa.amazon.nl")) {
                    c = 144;
                    break;
                }
                break;
            case 1976237062:
                if (str.equals("https://projectdee-ui-brodie-beta.aka.amazon.com")) {
                    c = 145;
                    break;
                }
                break;
            case 2083263914:
                if (str.equals("https://projectdee-ui-pico-beta.aka.amazon.com")) {
                    c = 146;
                    break;
                }
                break;
            case 2109135964:
                if (str.equals("https://na-api-alexa-gamma.amazon.com.au")) {
                    c = 147;
                    break;
                }
                break;
            case 2109135992:
                if (str.equals("https://na-api-alexa-gamma.amazon.com.br")) {
                    c = 148;
                    break;
                }
                break;
            case 2109136339:
                if (str.equals("https://na-api-alexa-gamma.amazon.com.mx")) {
                    c = 149;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 4:
            case 7:
            case '\n':
            case '/':
            case '2':
            case 'O':
            case '_':
            case 'z':
            case '~':
            case 147:
                return CountryCode.AU;
            case 1:
            case 19:
            case 29:
            case '\'':
            case ';':
            case 'H':
            case 'd':
            case 'k':
            case 's':
            case 130:
            case 138:
                return CountryCode.CA;
            case 2:
            case '\r':
            case 15:
            case '%':
            case '5':
            case 'D':
            case 'R':
            case 'Y':
            case '[':
            case ']':
            case 'b':
                return CountryCode.JP;
            case 3:
            case 14:
            case 16:
            case 26:
            case 28:
            case '&':
            case '6':
            case '9':
            case 'B':
            case 'S':
            case 'Z':
            case '\\':
            case '^':
            case 'c':
            case 'r':
            case 146:
                return CountryCode.GB;
            case 5:
            case '\b':
            case 11:
            case '0':
            case '3':
            case 'P':
            case 'W':
            case '`':
            case '{':
            case 127:
            case 148:
                return CountryCode.BR;
            case 6:
            case '\t':
            case '\f':
            case '1':
            case '4':
            case 'C':
            case 'Q':
            case 'a':
            case '|':
            case 128:
            case 149:
                return CountryCode.MX;
            case 17:
            case 18:
            case 27:
            case '.':
            case '7':
            case ':':
            case 'E':
            case 'F':
            case 'T':
            case 'V':
            case 'X':
            case 129:
                return CountryCode.US;
            case 20:
            case 30:
            case '(':
            case '<':
            case 'I':
            case 'e':
            case 'l':
            case 't':
            case '}':
            case 131:
            case 139:
            case 145:
                return CountryCode.DE;
            case 21:
            case 31:
            case ')':
            case '=':
            case 'G':
            case 'J':
            case 'f':
            case 'm':
            case 'u':
            case 132:
            case 140:
                return CountryCode.ES;
            case 22:
            case ' ':
            case '*':
            case '>':
            case 'K':
            case 'g':
            case 'n':
            case 'v':
            case 133:
            case 137:
            case 141:
                return CountryCode.FR;
            case 23:
            case '!':
            case '+':
            case '8':
            case '?':
            case 'L':
            case 'h':
            case 'o':
            case 'w':
            case 134:
            case 142:
                return CountryCode.IN;
            case 24:
            case '\"':
            case ',':
            case '@':
            case ByteCodes.astore_2 /* 77 */:
            case 'U':
            case 'i':
            case 'p':
            case 'x':
            case 135:
            case 143:
                return CountryCode.IT;
            case 25:
            case '#':
            case '$':
            case '-':
            case 'A':
            case 'N':
            case 'j':
            case 'q':
            case 'y':
            case 136:
            case 144:
                return CountryCode.NL;
            default:
                return CountryCode.US;
        }
    }
}
