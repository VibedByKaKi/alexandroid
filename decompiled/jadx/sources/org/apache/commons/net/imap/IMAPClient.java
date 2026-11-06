package org.apache.commons.net.imap;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class IMAPClient extends IMAP {
    private static final char DQUOTE = '\"';
    private static final String DQUOTE_S = "\"";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FETCH_ITEM_NAMES {
        ALL,
        FAST,
        FULL,
        BODY,
        BODYSTRUCTURE,
        ENVELOPE,
        FLAGS,
        INTERNALDATE,
        RFC822,
        UID
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SEARCH_CRITERIA {
        ALL,
        ANSWERED,
        BCC,
        BEFORE,
        BODY,
        CC,
        DELETED,
        DRAFT,
        FLAGGED,
        FROM,
        HEADER,
        KEYWORD,
        LARGER,
        NEW,
        NOT,
        OLD,
        ON,
        OR,
        RECENT,
        SEEN,
        SENTBEFORE,
        SENTON,
        SENTSINCE,
        SINCE,
        SMALLER,
        SUBJECT,
        TEXT,
        TO,
        UID,
        UNANSWERED,
        UNDELETED,
        UNDRAFT,
        UNFLAGGED,
        UNKEYWORD,
        UNSEEN
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum STATUS_DATA_ITEMS {
        MESSAGES,
        RECENT,
        UIDNEXT,
        UIDVALIDITY,
        UNSEEN
    }

    public boolean append(String str, String str2, String str3, String str4) throws IOException {
        StringBuilder sb = new StringBuilder(IMAP.quoteMailboxName(str));
        if (str2 != null) {
            sb.append(" ");
            sb.append(str2);
        }
        if (str3 != null) {
            sb.append(" ");
            if (str3.charAt(0) == '\"') {
                sb.append(str3);
            } else {
                sb.append('\"');
                sb.append(str3);
                sb.append('\"');
            }
        }
        sb.append(" ");
        if (str4.startsWith("\"") && str4.endsWith("\"")) {
            sb.append(str4);
            return doCommand(IMAPCommand.APPEND, sb.toString());
        }
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        sb.append(str4.getBytes("ISO-8859-1").length);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return IMAPReply.isContinuation(sendCommand(IMAPCommand.APPEND, sb.toString())) && IMAPReply.isSuccess(sendData(str4));
    }

    public boolean capability() throws IOException {
        return doCommand(IMAPCommand.CAPABILITY);
    }

    public boolean check() throws IOException {
        return doCommand(IMAPCommand.CHECK);
    }

    public boolean close() throws IOException {
        return doCommand(IMAPCommand.CLOSE);
    }

    public boolean copy(String str, String str2) throws IOException {
        IMAPCommand iMAPCommand = IMAPCommand.COPY;
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, " ");
        m1m.append(IMAP.quoteMailboxName(str2));
        return doCommand(iMAPCommand, m1m.toString());
    }

    public boolean create(String str) throws IOException {
        return doCommand(IMAPCommand.CREATE, IMAP.quoteMailboxName(str));
    }

    public boolean delete(String str) throws IOException {
        return doCommand(IMAPCommand.DELETE, IMAP.quoteMailboxName(str));
    }

    public boolean examine(String str) throws IOException {
        return doCommand(IMAPCommand.EXAMINE, IMAP.quoteMailboxName(str));
    }

    public boolean expunge() throws IOException {
        return doCommand(IMAPCommand.EXPUNGE);
    }

    public boolean fetch(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.FETCH, str + " " + str2);
    }

    public boolean list(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.LIST, IMAP.quoteMailboxName(str) + " " + IMAP.quoteMailboxName(str2));
    }

    public boolean login(String str, String str2) throws IOException {
        if (getState() != IMAP.IMAPState.NOT_AUTH_STATE) {
            return false;
        }
        if (!doCommand(IMAPCommand.LOGIN, str + " " + str2)) {
            return false;
        }
        setState(IMAP.IMAPState.AUTH_STATE);
        return true;
    }

    public boolean logout() throws IOException {
        return doCommand(IMAPCommand.LOGOUT);
    }

    public boolean lsub(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.LSUB, IMAP.quoteMailboxName(str) + " " + IMAP.quoteMailboxName(str2));
    }

    public boolean noop() throws IOException {
        return doCommand(IMAPCommand.NOOP);
    }

    public boolean rename(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.RENAME, IMAP.quoteMailboxName(str) + " " + IMAP.quoteMailboxName(str2));
    }

    public boolean search(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.SEARCH, BitVector$$ExternalSyntheticOutline0.m(str != null ? "CHARSET ".concat(str) : "", str2));
    }

    public boolean select(String str) throws IOException {
        return doCommand(IMAPCommand.SELECT, IMAP.quoteMailboxName(str));
    }

    public boolean status(String str, String[] strArr) throws IOException {
        if (strArr == null || strArr.length < 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("STATUS command requires at least one data item name");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(IMAP.quoteMailboxName(str));
        sb.append(" (");
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(strArr[i]);
        }
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return doCommand(IMAPCommand.STATUS, sb.toString());
    }

    public boolean store(String str, String str2, String str3) throws IOException {
        return doCommand(IMAPCommand.STORE, ParcelCompat$$ExternalSyntheticOutline0.m(str, " ", str2, " ", str3));
    }

    public boolean subscribe(String str) throws IOException {
        return doCommand(IMAPCommand.SUBSCRIBE, IMAP.quoteMailboxName(str));
    }

    public boolean uid(String str, String str2) throws IOException {
        return doCommand(IMAPCommand.UID, str + " " + str2);
    }

    public boolean unsubscribe(String str) throws IOException {
        return doCommand(IMAPCommand.UNSUBSCRIBE, IMAP.quoteMailboxName(str));
    }

    public boolean search(String str) throws IOException {
        return search(null, str);
    }

    @Deprecated
    public boolean append(String str, String str2, String str3) throws IOException {
        if (str2 != null) {
            str = a$$ExternalSyntheticOutline0.m$1(str, " ", str2);
        }
        if (str3 != null) {
            if (str3.charAt(0) == '{') {
                str = a$$ExternalSyntheticOutline0.m$1(str, " ", str3);
            } else {
                str = TableInfo$$ExternalSyntheticOutline0.m$1(str, " {", str3, StringSubstitutor.DEFAULT_VAR_END);
            }
        }
        return doCommand(IMAPCommand.APPEND, str);
    }

    @Deprecated
    public boolean append(String str) throws IOException {
        return append(str, null, null);
    }
}
