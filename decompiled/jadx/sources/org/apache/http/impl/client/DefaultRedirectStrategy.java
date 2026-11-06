package org.apache.http.impl.client;

import defpackage.a$$ExternalSyntheticOutline0;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes11.dex */
public class DefaultRedirectStrategy implements RedirectStrategy {
    public static final DefaultRedirectStrategy INSTANCE = new DefaultRedirectStrategy();

    @Deprecated
    public static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    public static final int SC_PERMANENT_REDIRECT = 308;
    private final Log log;
    private final String[] redirectMethods;

    public DefaultRedirectStrategy(String[] strArr) {
        this.log = LogFactory.getLog(getClass());
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.redirectMethods = strArr2;
    }

    public URI createLocationURI(String str) throws ProtocolException {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new ProtocolException(a$$ExternalSyntheticOutline0.m("Invalid redirect URI: ", str), e);
        }
    }

    public URI getLocationURI(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (firstHeader == null) {
            throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
        }
        String value = firstHeader.getValue();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Redirect requested to location '" + value + "'");
        }
        RequestConfig requestConfig = adapt.getRequestConfig();
        URI createLocationURI = createLocationURI(value);
        try {
            if (requestConfig.isNormalizeUri()) {
                createLocationURI = URIUtils.normalizeSyntax(createLocationURI);
            }
            if (!createLocationURI.isAbsolute()) {
                if (!requestConfig.isRelativeRedirectsAllowed()) {
                    throw new ProtocolException("Relative redirect location '" + createLocationURI + "' not allowed");
                }
                HttpHost targetHost = adapt.getTargetHost();
                Asserts.notNull(targetHost, "Target host");
                createLocationURI = URIUtils.resolve(URIUtils.rewriteURI(new URI(httpRequest.getRequestLine().getUri()), targetHost, requestConfig.isNormalizeUri() ? URIUtils.NORMALIZE : URIUtils.NO_FLAGS), createLocationURI);
            }
            RedirectLocations redirectLocations = (RedirectLocations) adapt.getAttribute("http.protocol.redirect-locations");
            if (redirectLocations == null) {
                redirectLocations = new RedirectLocations();
                httpContext.setAttribute("http.protocol.redirect-locations", redirectLocations);
            }
            if (requestConfig.isCircularRedirectsAllowed() || !redirectLocations.contains(createLocationURI)) {
                redirectLocations.add(createLocationURI);
                return createLocationURI;
            }
            throw new CircularRedirectException("Circular redirect to '" + createLocationURI + "'");
        } catch (URISyntaxException e) {
            throw new ProtocolException(e.getMessage(), e);
        }
    }

    @Override // org.apache.http.client.RedirectStrategy
    public HttpUriRequest getRedirect(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        URI locationURI = getLocationURI(httpRequest, httpResponse, httpContext);
        String method = httpRequest.getRequestLine().getMethod();
        if (method.equalsIgnoreCase(HttpHead.METHOD_NAME)) {
            return new HttpHead(locationURI);
        }
        if (method.equalsIgnoreCase("GET")) {
            return new HttpGet(locationURI);
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        return (statusCode == 307 || statusCode == 308) ? RequestBuilder.copy(httpRequest).setUri(locationURI).build() : new HttpGet(locationURI);
    }

    public boolean isRedirectable(String str) {
        return Arrays.binarySearch(this.redirectMethods, str) >= 0;
    }

    @Override // org.apache.http.client.RedirectStrategy
    public boolean isRedirected(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpResponse, "HTTP response");
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String method = httpRequest.getRequestLine().getMethod();
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (statusCode != 307 && statusCode != 308) {
            switch (statusCode) {
                case 301:
                    break;
                case 302:
                    return isRedirectable(method) && firstHeader != null;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        return isRedirectable(method);
    }

    public DefaultRedirectStrategy() {
        this(new String[]{"GET", HttpHead.METHOD_NAME});
    }
}
