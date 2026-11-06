package org.apache.commons.net.imap;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.io.CRLFLineReader;
import org.apache.commons.net.util.NetConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class IMAP extends SocketClient {
    public static final int DEFAULT_PORT = 143;
    public static final IMAPChunkListener TRUE_CHUNK_LISTENER = new IMAPChunkListener() { // from class: org.apache.commons.net.imap.IMAP.1
        @Override // org.apache.commons.net.imap.IMAP.IMAPChunkListener
        public boolean chunkReceived(IMAP imap) {
            return true;
        }
    };
    protected static final String __DEFAULT_ENCODING = "ISO-8859-1";
    protected BufferedWriter __writer;
    protected BufferedReader _reader;
    private volatile IMAPChunkListener chunkListener;
    private final char[] initialID = {'A', 'A', 'A', 'A'};
    private int replyCode;
    private final List<String> replyLines;
    private IMAPState state;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IMAPChunkListener {
        boolean chunkReceived(IMAP imap);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum IMAPState {
        DISCONNECTED_STATE,
        NOT_AUTH_STATE,
        AUTH_STATE,
        LOGOUT_STATE
    }

    public IMAP() {
        setDefaultPort(143);
        this.state = IMAPState.DISCONNECTED_STATE;
        this._reader = null;
        this.__writer = null;
        this.replyLines = new ArrayList();
        createCommandSupport();
    }

    private void getReply(boolean z) throws IOException {
        IMAPChunkListener iMAPChunkListener;
        this.replyLines.clear();
        String readLine = this._reader.readLine();
        if (readLine == null) {
            Buffer$$ExternalSyntheticBUOutline0.m$3("Connection closed without indication.");
            return;
        }
        this.replyLines.add(readLine);
        if (z) {
            while (IMAPReply.isUntagged(readLine)) {
                int literalCount = IMAPReply.literalCount(readLine);
                boolean z2 = literalCount >= 0;
                while (literalCount >= 0) {
                    String readLine2 = this._reader.readLine();
                    if (readLine2 == null) {
                        Buffer$$ExternalSyntheticBUOutline0.m$3("Connection closed without indication.");
                        return;
                    } else {
                        this.replyLines.add(readLine2);
                        literalCount -= readLine2.length() + 2;
                    }
                }
                if (z2 && (iMAPChunkListener = this.chunkListener) != null && iMAPChunkListener.chunkReceived(this)) {
                    fireReplyReceived(3, getReplyString());
                    this.replyLines.clear();
                }
                readLine = this._reader.readLine();
                if (readLine == null) {
                    Buffer$$ExternalSyntheticBUOutline0.m$3("Connection closed without indication.");
                    return;
                }
                this.replyLines.add(readLine);
            }
            this.replyCode = IMAPReply.getReplyCode(readLine);
        } else {
            this.replyCode = IMAPReply.getUntaggedReplyCode(readLine);
        }
        fireReplyReceived(this.replyCode, getReplyString());
    }

    public static String quoteMailboxName(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return "\"\"";
        }
        if ((str.length() > 1 && str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) && str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE)) || !str.contains(" ")) {
            return str;
        }
        return DeviceConfigConstants.DOUBLE_QUOTE + str.replaceAll("([\\\\\"])", "\\\\$1") + DeviceConfigConstants.DOUBLE_QUOTE;
    }

    private int sendCommandWithID(String str, String str2, String str3) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(str2);
        if (str3 != null) {
            sb.append(' ');
            sb.append(str3);
        }
        sb.append("\r\n");
        String sb2 = sb.toString();
        this.__writer.write(sb2);
        this.__writer.flush();
        fireCommandSent(str2, sb2);
        getReply();
        return this.replyCode;
    }

    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() throws IOException {
        super._connectAction_();
        this._reader = new CRLFLineReader(new InputStreamReader(this._input_, "ISO-8859-1"));
        this.__writer = new BufferedWriter(new OutputStreamWriter(this._output_, "ISO-8859-1"));
        int soTimeout = getSoTimeout();
        if (soTimeout <= 0) {
            setSoTimeout(this.connectTimeout);
        }
        getReply(false);
        if (soTimeout <= 0) {
            setSoTimeout(soTimeout);
        }
        setState(IMAPState.NOT_AUTH_STATE);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() throws IOException {
        super.disconnect();
        this._reader = null;
        this.__writer = null;
        this.replyLines.clear();
        setState(IMAPState.DISCONNECTED_STATE);
    }

    public boolean doCommand(IMAPCommand iMAPCommand, String str) throws IOException {
        return IMAPReply.isSuccess(sendCommand(iMAPCommand, str));
    }

    @Override // org.apache.commons.net.SocketClient
    public void fireReplyReceived(int i, String str) {
        if (getCommandSupport().getListenerCount() > 0) {
            getCommandSupport().fireReplyReceived(i, getReplyString());
        }
    }

    public String generateCommandID() {
        String str = new String(this.initialID);
        boolean z = true;
        for (int length = this.initialID.length - 1; z && length >= 0; length--) {
            char[] cArr = this.initialID;
            char c = cArr[length];
            if (c == 'Z') {
                cArr[length] = 'A';
            } else {
                cArr[length] = (char) (c + 1);
                z = false;
            }
        }
        return str;
    }

    public String getReplyString() {
        StringBuilder sb = new StringBuilder(256);
        Iterator<String> it2 = this.replyLines.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public String[] getReplyStrings() {
        return (String[]) this.replyLines.toArray(NetConstants.EMPTY_STRING_ARRAY);
    }

    public IMAPState getState() {
        return this.state;
    }

    public int sendCommand(String str, String str2) throws IOException {
        return sendCommandWithID(generateCommandID(), str, str2);
    }

    public int sendData(String str) throws IOException {
        return sendCommandWithID(null, str, null);
    }

    public void setChunkListener(IMAPChunkListener iMAPChunkListener) {
        this.chunkListener = iMAPChunkListener;
    }

    public void setState(IMAPState iMAPState) {
        this.state = iMAPState;
    }

    public boolean doCommand(IMAPCommand iMAPCommand) throws IOException {
        return IMAPReply.isSuccess(sendCommand(iMAPCommand));
    }

    public int sendCommand(String str) throws IOException {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(IMAPCommand iMAPCommand, String str) throws IOException {
        return sendCommand(iMAPCommand.getIMAPCommand(), str);
    }

    public int sendCommand(IMAPCommand iMAPCommand) throws IOException {
        return sendCommand(iMAPCommand, (String) null);
    }

    private void getReply() throws IOException {
        getReply(true);
    }
}
