package org.apache.thrift.orig.transport;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.config.ConnectionConfig;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.apache.hc.core5.util.Timeout;
import org.apache.thrift.orig.TConfiguration;
import org.apache.thrift.orig.THttpClientResponseHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class THttpClient extends TEndpointTransport {
    private static final Map<String, String> DEFAULT_HEADERS = Collections.unmodifiableMap(getDefaultHeaders());
    private final HttpClient client;
    private int connectTimeout_;
    private Map<String, String> customHeaders_;
    private final HttpHost host;
    private InputStream inputStream_;
    private int readTimeout_;
    private final ByteArrayOutputStream requestBuffer_;
    private final URL url_;

    public THttpClient(String str, HttpClient httpClient) throws TTransportException {
        super(new TConfiguration());
        this.requestBuffer_ = new ByteArrayOutputStream();
        this.inputStream_ = null;
        this.connectTimeout_ = 0;
        this.readTimeout_ = 0;
        this.customHeaders_ = null;
        try {
            URL url = new URL(str);
            this.url_ = url;
            this.client = httpClient;
            this.host = new HttpHost(url.getProtocol(), url.getHost(), -1 == url.getPort() ? url.getDefaultPort() : url.getPort());
        } catch (IOException e) {
            throw new TTransportException(e);
        }
    }

    private void flushUsingHttpClient() throws TTransportException {
        if (this.client == null) {
            throw new TTransportException("Null HttpClient, aborting.");
        }
        byte[] byteArray = this.requestBuffer_.toByteArray();
        this.requestBuffer_.reset();
        final HttpPost httpPost = new HttpPost(this.url_.getFile());
        try {
            try {
                httpPost.setConfig(getRequestConfig());
                DEFAULT_HEADERS.forEach(new BiConsumer() { // from class: org.apache.thrift.orig.transport.THttpClient$$ExternalSyntheticLambda0
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        httpPost.addHeader((String) obj, (String) obj2);
                    }
                });
                Map<String, String> map = this.customHeaders_;
                if (map != null) {
                    map.forEach(new BiConsumer() { // from class: org.apache.thrift.orig.transport.THttpClient$$ExternalSyntheticLambda0
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            httpPost.addHeader((String) obj, (String) obj2);
                        }
                    });
                }
                httpPost.setEntity(new ByteArrayEntity(byteArray, (ContentType) null));
                this.inputStream_ = (InputStream) this.client.execute(this.host, httpPost, new THttpClientResponseHandler());
                resetConsumedMessageSize(-1L);
            } catch (IOException e) {
                httpPost.abort();
                throw new TTransportException(e);
            }
        } catch (Throwable th) {
            resetConsumedMessageSize(-1L);
            throw th;
        }
    }

    private ConnectionConfig getConnectionConfig() {
        ConnectionConfig connectionConfig = ConnectionConfig.DEFAULT;
        return this.readTimeout_ > 0 ? ConnectionConfig.copy(connectionConfig).setSocketTimeout(Timeout.ofMilliseconds(this.readTimeout_)).build() : connectionConfig;
    }

    private static Map<String, String> getDefaultHeaders() {
        HashMap m = Automotive$$ExternalSyntheticOutline0.m("Content-Type", "application/x-thrift", "Accept", "application/x-thrift");
        m.put("User-Agent", "Java/THttpClient/HC");
        return m;
    }

    private RequestConfig getRequestConfig() {
        RequestConfig requestConfig = RequestConfig.DEFAULT;
        return this.connectTimeout_ > 0 ? RequestConfig.copy(requestConfig).setConnectionRequestTimeout(Timeout.ofMilliseconds(this.connectTimeout_)).build() : requestConfig;
    }

    @Override // org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.inputStream_;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.inputStream_ = null;
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void flush() throws TTransportException {
        if (this.client != null) {
            flushUsingHttpClient();
            return;
        }
        byte[] byteArray = this.requestBuffer_.toByteArray();
        this.requestBuffer_.reset();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) this.url_.openConnection();
                int i = this.connectTimeout_;
                if (i > 0) {
                    httpURLConnection.setConnectTimeout(i);
                }
                int i2 = this.readTimeout_;
                if (i2 > 0) {
                    httpURLConnection.setReadTimeout(i2);
                }
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/x-thrift");
                httpURLConnection.setRequestProperty("Accept", "application/x-thrift");
                httpURLConnection.setRequestProperty("User-Agent", "Java/THttpClient");
                Map<String, String> map = this.customHeaders_;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setDoOutput(true);
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(byteArray);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new TTransportException("HTTP Response code: " + responseCode);
                }
                this.inputStream_ = httpURLConnection.getInputStream();
                resetConsumedMessageSize(-1L);
            } catch (IOException e) {
                throw new TTransportException(e);
            }
        } catch (Throwable th) {
            resetConsumedMessageSize(-1L);
            throw th;
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int read(byte[] bArr, int i, int i2) throws TTransportException {
        if (this.inputStream_ == null) {
            throw new TTransportException("Response buffer is empty, no request.");
        }
        checkReadBytesAvailable(i2);
        try {
            int read = this.inputStream_.read(bArr, i, i2);
            if (read == -1) {
                throw new TTransportException("No more data available.");
            }
            countConsumedMessageBytes(read);
            return read;
        } catch (IOException e) {
            throw new TTransportException(e);
        }
    }

    public void setConnectTimeout(int i) {
        this.connectTimeout_ = i;
    }

    public void setCustomHeader(String str, String str2) {
        if (this.customHeaders_ == null) {
            this.customHeaders_ = new HashMap();
        }
        this.customHeaders_.put(str, str2);
    }

    public void setCustomHeaders(Map<String, String> map) {
        this.customHeaders_ = new HashMap(map);
    }

    @Deprecated
    public void setReadTimeout(int i) {
        this.readTimeout_ = i;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void write(byte[] bArr, int i, int i2) {
        this.requestBuffer_.write(bArr, i, i2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Factory extends TTransportFactory {
        private final HttpClient client;
        private final String url;

        public Factory(String str) {
            this.url = str;
            this.client = null;
        }

        @Override // org.apache.thrift.orig.transport.TTransportFactory
        public TTransport getTransport(TTransport tTransport) {
            try {
                return this.client != null ? new THttpClient(tTransport.getConfiguration(), this.url, this.client) : new THttpClient(tTransport.getConfiguration(), this.url);
            } catch (TTransportException unused) {
                return null;
            }
        }

        public Factory(String str, HttpClient httpClient) {
            this.url = str;
            this.client = httpClient;
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void open() {
    }

    public THttpClient(String str) throws TTransportException {
        super(new TConfiguration());
        this.requestBuffer_ = new ByteArrayOutputStream();
        this.inputStream_ = null;
        this.connectTimeout_ = 0;
        this.readTimeout_ = 0;
        this.customHeaders_ = null;
        try {
            this.url_ = new URL(str);
            this.client = null;
            this.host = null;
        } catch (IOException e) {
            throw new TTransportException(e);
        }
    }

    public THttpClient(TConfiguration tConfiguration, String str, HttpClient httpClient) throws TTransportException {
        super(tConfiguration);
        this.requestBuffer_ = new ByteArrayOutputStream();
        this.inputStream_ = null;
        this.connectTimeout_ = 0;
        this.readTimeout_ = 0;
        this.customHeaders_ = null;
        try {
            URL url = new URL(str);
            this.url_ = url;
            this.client = httpClient;
            this.host = new HttpHost(url.getProtocol(), url.getHost(), -1 == url.getPort() ? url.getDefaultPort() : url.getPort());
        } catch (IOException e) {
            throw new TTransportException(e);
        }
    }

    public THttpClient(TConfiguration tConfiguration, String str) throws TTransportException {
        super(tConfiguration);
        this.requestBuffer_ = new ByteArrayOutputStream();
        this.inputStream_ = null;
        this.connectTimeout_ = 0;
        this.readTimeout_ = 0;
        this.customHeaders_ = null;
        try {
            this.url_ = new URL(str);
            this.client = null;
            this.host = null;
        } catch (IOException e) {
            throw new TTransportException(e);
        }
    }
}
