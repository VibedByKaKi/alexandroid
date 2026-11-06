package com.google.zxing.oned.rss.expanded.decoders;

import com.amazon.deecomms.common.Constants;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.objectweb.asm.signature.SignatureVisitor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class GeneralAppIdDecoder {
    private final BitArray information;
    private final CurrentParsingState current = new CurrentParsingState();
    private final StringBuilder buffer = new StringBuilder();

    public GeneralAppIdDecoder(BitArray bitArray) {
        this.information = bitArray;
    }

    private DecodedChar decodeAlphanumeric(int i) {
        char c;
        int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i, 5);
        if (extractNumericValueFromBitArray == 15) {
            return new DecodedChar(i + 5, '$');
        }
        if (extractNumericValueFromBitArray >= 5 && extractNumericValueFromBitArray < 15) {
            return new DecodedChar(i + 5, (char) (extractNumericValueFromBitArray + 43));
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i, 6);
        if (extractNumericValueFromBitArray2 >= 32 && extractNumericValueFromBitArray2 < 58) {
            return new DecodedChar(i + 6, (char) (extractNumericValueFromBitArray2 + 33));
        }
        switch (extractNumericValueFromBitArray2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = AbstractJsonLexerKt.COMMA;
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(extractNumericValueFromBitArray2, "Decoding invalid alphanumeric value: "));
                return null;
        }
        return new DecodedChar(i + 6, c);
    }

    private DecodedChar decodeIsoIec646(int i) throws FormatException {
        int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i, 5);
        if (extractNumericValueFromBitArray == 15) {
            return new DecodedChar(i + 5, '$');
        }
        char c = SignatureVisitor.EXTENDS;
        if (extractNumericValueFromBitArray >= 5 && extractNumericValueFromBitArray < 15) {
            return new DecodedChar(i + 5, (char) (extractNumericValueFromBitArray + 43));
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i, 7);
        if (extractNumericValueFromBitArray2 >= 64 && extractNumericValueFromBitArray2 < 90) {
            return new DecodedChar(i + 7, (char) (extractNumericValueFromBitArray2 + 1));
        }
        if (extractNumericValueFromBitArray2 >= 90 && extractNumericValueFromBitArray2 < 116) {
            return new DecodedChar(i + 7, (char) (extractNumericValueFromBitArray2 + 7));
        }
        switch (extractNumericValueFromBitArray(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE /* 234 */:
                c = '%';
                break;
            case 235:
                c = Typography.amp;
                break;
            case TelnetCommand.EOF /* 236 */:
                c = '\'';
                break;
            case TelnetCommand.SUSP /* 237 */:
                c = '(';
                break;
            case TelnetCommand.ABORT /* 238 */:
                c = ')';
                break;
            case TelnetCommand.EOR /* 239 */:
                c = '*';
                break;
            case 240:
                break;
            case TelnetCommand.NOP /* 241 */:
                c = AbstractJsonLexerKt.COMMA;
                break;
            case 242:
                c = '-';
                break;
            case TelnetCommand.BREAK /* 243 */:
                c = '.';
                break;
            case TelnetCommand.IP /* 244 */:
                c = '/';
                break;
            case TelnetCommand.AO /* 245 */:
                c = AbstractJsonLexerKt.COLON;
                break;
            case TelnetCommand.AYT /* 246 */:
                c = ';';
                break;
            case TelnetCommand.EC /* 247 */:
                c = Typography.less;
                break;
            case TelnetCommand.EL /* 248 */:
                c = '=';
                break;
            case TelnetCommand.GA /* 249 */:
                c = Typography.greater;
                break;
            case 250:
                c = Constants.DEFAULT_IMAGE_CHAR;
                break;
            case 251:
                c = '_';
                break;
            case TelnetCommand.WONT /* 252 */:
                c = ' ';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new DecodedChar(i + 8, c);
    }

    private DecodedNumeric decodeNumeric(int i) throws FormatException {
        int i2 = i + 7;
        if (i2 <= this.information.getSize()) {
            int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i, 7) - 8;
            return new DecodedNumeric(i2, extractNumericValueFromBitArray / 11, extractNumericValueFromBitArray % 11);
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i, 4);
        BitArray bitArray = this.information;
        return extractNumericValueFromBitArray2 == 0 ? new DecodedNumeric(bitArray.getSize(), 10, 10) : new DecodedNumeric(bitArray.getSize(), extractNumericValueFromBitArray2 - 1, 10);
    }

    public static int extractNumericValueFromBitArray(BitArray bitArray, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (bitArray.get(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    private boolean isAlphaOr646ToNumericLatch(int i) {
        int i2 = i + 3;
        if (i2 > this.information.getSize()) {
            return false;
        }
        while (i < i2) {
            if (this.information.get(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean isAlphaTo646ToAlphaLatch(int i) {
        int i2;
        if (i + 1 > this.information.getSize()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.information.getSize(); i3++) {
            BitArray bitArray = this.information;
            if (i3 == 2) {
                if (!bitArray.get(i + 2)) {
                    return false;
                }
            } else if (bitArray.get(i2)) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumericToAlphaNumericLatch(int i) {
        int i2;
        if (i + 1 > this.information.getSize()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.information.getSize(); i3++) {
            if (this.information.get(i2)) {
                return false;
            }
        }
        return true;
    }

    private boolean isStillAlpha(int i) {
        int extractNumericValueFromBitArray;
        if (i + 5 > this.information.getSize()) {
            return false;
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i, 5);
        if (extractNumericValueFromBitArray2 < 5 || extractNumericValueFromBitArray2 >= 16) {
            return i + 6 <= this.information.getSize() && (extractNumericValueFromBitArray = extractNumericValueFromBitArray(i, 6)) >= 16 && extractNumericValueFromBitArray < 63;
        }
        return true;
    }

    private boolean isStillIsoIec646(int i) {
        int extractNumericValueFromBitArray;
        if (i + 5 > this.information.getSize()) {
            return false;
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i, 5);
        if (extractNumericValueFromBitArray2 >= 5 && extractNumericValueFromBitArray2 < 16) {
            return true;
        }
        if (i + 7 > this.information.getSize()) {
            return false;
        }
        int extractNumericValueFromBitArray3 = extractNumericValueFromBitArray(i, 7);
        if (extractNumericValueFromBitArray3 < 64 || extractNumericValueFromBitArray3 >= 116) {
            return i + 8 <= this.information.getSize() && (extractNumericValueFromBitArray = extractNumericValueFromBitArray(i, 8)) >= 232 && extractNumericValueFromBitArray < 253;
        }
        return true;
    }

    private boolean isStillNumeric(int i) {
        if (i + 7 > this.information.getSize()) {
            return i + 4 <= this.information.getSize();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            BitArray bitArray = this.information;
            if (i2 >= i3) {
                return bitArray.get(i3);
            }
            if (bitArray.get(i2)) {
                return true;
            }
            i2++;
        }
    }

    private BlockParsedResult parseAlphaBlock() {
        while (true) {
            boolean isStillAlpha = isStillAlpha(this.current.getPosition());
            CurrentParsingState currentParsingState = this.current;
            if (!isStillAlpha) {
                boolean isAlphaOr646ToNumericLatch = isAlphaOr646ToNumericLatch(currentParsingState.getPosition());
                CurrentParsingState currentParsingState2 = this.current;
                if (isAlphaOr646ToNumericLatch) {
                    currentParsingState2.incrementPosition(3);
                    this.current.setNumeric();
                } else if (isAlphaTo646ToAlphaLatch(currentParsingState2.getPosition())) {
                    int position = this.current.getPosition() + 5;
                    int size = this.information.getSize();
                    CurrentParsingState currentParsingState3 = this.current;
                    if (position < size) {
                        currentParsingState3.incrementPosition(5);
                    } else {
                        currentParsingState3.setPosition(this.information.getSize());
                    }
                    this.current.setIsoIec646();
                }
                return new BlockParsedResult();
            }
            DecodedChar decodeAlphanumeric = decodeAlphanumeric(currentParsingState.getPosition());
            this.current.setPosition(decodeAlphanumeric.getNewPosition());
            if (decodeAlphanumeric.isFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeAlphanumeric.getValue());
        }
    }

    private DecodedInformation parseBlocks() throws FormatException {
        BlockParsedResult parseNumericBlock;
        boolean isFinished;
        do {
            int position = this.current.getPosition();
            if (this.current.isAlpha()) {
                parseNumericBlock = parseAlphaBlock();
                isFinished = parseNumericBlock.isFinished();
            } else if (this.current.isIsoIec646()) {
                parseNumericBlock = parseIsoIec646Block();
                isFinished = parseNumericBlock.isFinished();
            } else {
                parseNumericBlock = parseNumericBlock();
                isFinished = parseNumericBlock.isFinished();
            }
            if (position == this.current.getPosition() && !isFinished) {
                break;
            }
        } while (!isFinished);
        return parseNumericBlock.getDecodedInformation();
    }

    private BlockParsedResult parseIsoIec646Block() throws FormatException {
        while (true) {
            boolean isStillIsoIec646 = isStillIsoIec646(this.current.getPosition());
            CurrentParsingState currentParsingState = this.current;
            if (!isStillIsoIec646) {
                boolean isAlphaOr646ToNumericLatch = isAlphaOr646ToNumericLatch(currentParsingState.getPosition());
                CurrentParsingState currentParsingState2 = this.current;
                if (isAlphaOr646ToNumericLatch) {
                    currentParsingState2.incrementPosition(3);
                    this.current.setNumeric();
                } else if (isAlphaTo646ToAlphaLatch(currentParsingState2.getPosition())) {
                    int position = this.current.getPosition() + 5;
                    int size = this.information.getSize();
                    CurrentParsingState currentParsingState3 = this.current;
                    if (position < size) {
                        currentParsingState3.incrementPosition(5);
                    } else {
                        currentParsingState3.setPosition(this.information.getSize());
                    }
                    this.current.setAlpha();
                }
                return new BlockParsedResult();
            }
            DecodedChar decodeIsoIec646 = decodeIsoIec646(currentParsingState.getPosition());
            this.current.setPosition(decodeIsoIec646.getNewPosition());
            if (decodeIsoIec646.isFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeIsoIec646.getValue());
        }
    }

    private BlockParsedResult parseNumericBlock() throws FormatException {
        while (true) {
            boolean isStillNumeric = isStillNumeric(this.current.getPosition());
            CurrentParsingState currentParsingState = this.current;
            if (!isStillNumeric) {
                if (isNumericToAlphaNumericLatch(currentParsingState.getPosition())) {
                    this.current.setAlpha();
                    this.current.incrementPosition(4);
                }
                return new BlockParsedResult();
            }
            DecodedNumeric decodeNumeric = decodeNumeric(currentParsingState.getPosition());
            this.current.setPosition(decodeNumeric.getNewPosition());
            if (decodeNumeric.isFirstDigitFNC1()) {
                boolean isSecondDigitFNC1 = decodeNumeric.isSecondDigitFNC1();
                CurrentParsingState currentParsingState2 = this.current;
                return new BlockParsedResult(isSecondDigitFNC1 ? new DecodedInformation(currentParsingState2.getPosition(), this.buffer.toString()) : new DecodedInformation(currentParsingState2.getPosition(), this.buffer.toString(), decodeNumeric.getSecondDigit()), true);
            }
            this.buffer.append(decodeNumeric.getFirstDigit());
            if (decodeNumeric.isSecondDigitFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeNumeric.getSecondDigit());
        }
    }

    public String decodeAllCodes(StringBuilder sb, int i) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            DecodedInformation decodeGeneralPurposeField = decodeGeneralPurposeField(i, str);
            String parseFieldsInGeneralPurpose = FieldParser.parseFieldsInGeneralPurpose(decodeGeneralPurposeField.getNewString());
            if (parseFieldsInGeneralPurpose != null) {
                sb.append(parseFieldsInGeneralPurpose);
            }
            String valueOf = decodeGeneralPurposeField.isRemaining() ? String.valueOf(decodeGeneralPurposeField.getRemainingValue()) : null;
            if (i == decodeGeneralPurposeField.getNewPosition()) {
                return sb.toString();
            }
            i = decodeGeneralPurposeField.getNewPosition();
            str = valueOf;
        }
    }

    public DecodedInformation decodeGeneralPurposeField(int i, String str) throws FormatException {
        this.buffer.setLength(0);
        if (str != null) {
            this.buffer.append(str);
        }
        this.current.setPosition(i);
        DecodedInformation parseBlocks = parseBlocks();
        return (parseBlocks == null || !parseBlocks.isRemaining()) ? new DecodedInformation(this.current.getPosition(), this.buffer.toString()) : new DecodedInformation(this.current.getPosition(), this.buffer.toString(), parseBlocks.getRemainingValue());
    }

    public int extractNumericValueFromBitArray(int i, int i2) {
        return extractNumericValueFromBitArray(this.information, i, i2);
    }
}
