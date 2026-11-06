package com.amazon.alexa.accessory.crypto;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.crypto.cipher.Nonce;
import com.amazon.alexa.accessory.crypto.cipher.SupportedCipherSuite;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import defpackage.a$$ExternalSyntheticOutline0;
import java.security.Key;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface CryptoKeyDataStore {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class KeysAlreadyExistException extends CryptoKeyDataStoreException {
        public KeysAlreadyExistException(String str, String str2) {
            super(str, str2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ListResult {
        public final List<String> identifiers;
        public final PaginationToken paginationToken;

        public ListResult(List<String> list, PaginationToken paginationToken) {
            Preconditions.notNull(list, "identifiers");
            Preconditions.notNull(paginationToken, "paginationToken");
            this.identifiers = list;
            this.paginationToken = paginationToken;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NegotiatedData {
        public final Key authenticationKey;
        public final SupportedCipherSuite cipherSuite;
        public final String cipherTransform;
        public final Key encryptionKey;
        public final int keyExchangeProtocolVersion;
        public final long keyExchangeTimestampMillis;
        public final long lastKeyRotationTimestampMillis;
        public final Key rootKey;

        public NegotiatedData(int i, SupportedCipherSuite supportedCipherSuite, String str, Key key, Key key2, Key key3, long j, long j2) {
            Preconditions.precondition(i > 0, "keyExchangeProtocolVersion");
            Preconditions.notNull(supportedCipherSuite, "cipherSuite");
            Preconditions.notNull(key, "rootKey");
            Preconditions.notNull(key2, "encryptionKey");
            Preconditions.notNull(key3, "authenticationKey");
            Preconditions.precondition(j > 0, "keyExchangeTimestampMillis");
            Preconditions.precondition(j2 >= 0, "lastKeyRotationTimestampMillis");
            Preconditions.precondition(!Strings.isNullOrEmpty(str), "cipherTransform");
            this.keyExchangeProtocolVersion = i;
            this.cipherSuite = supportedCipherSuite;
            this.cipherTransform = str;
            this.rootKey = key;
            this.encryptionKey = key2;
            this.authenticationKey = key3;
            this.keyExchangeTimestampMillis = j;
            this.lastKeyRotationTimestampMillis = j2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PaginationToken {
        public static final PaginationToken EMPTY = new PaginationToken("");
        public final String value;

        public PaginationToken(String str) {
            Preconditions.notNull(str, "value");
            this.value = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UnrecognizedAccessoryException extends CryptoKeyDataStoreException {
        public UnrecognizedAccessoryException(String str, String str2) {
            super(str, str2);
        }
    }

    NegotiatedData generateKeys(String str, Nonce nonce, Nonce nonce2, SupportedCipherSuite supportedCipherSuite, int i) throws KeysAlreadyExistException, InvalidInputsException;

    NegotiatedData getData(String str);

    ListResult listNegotiatedAccessories(int i, PaginationToken paginationToken) throws InvalidInputsException;

    void removeData(Iterable<String> iterable);

    void removeData(String str);

    NegotiatedData rotateDerivedKeys(String str, Nonce nonce, Nonce nonce2) throws UnrecognizedAccessoryException, InvalidInputsException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CryptoKeyDataStoreIOException extends CryptoKeyDataStoreException {
        public CryptoKeyDataStoreIOException(String str, String str2) {
            super(str, str2);
        }

        public CryptoKeyDataStoreIOException(String str, String str2, Throwable th) {
            super(str, str2, th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InvalidStoreStateException extends CryptoKeyDataStoreException {
        public InvalidStoreStateException(String str, String str2) {
            super(str, str2);
        }

        public InvalidStoreStateException(String str, String str2, Throwable th) {
            super(str, str2, th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class CryptoKeyDataStoreException extends RuntimeException {
        private final String accessoryId;

        public CryptoKeyDataStoreException(String str, String str2, Throwable th) {
            this(str, str2);
            initCause(th);
        }

        public String getAccessoryId() {
            return this.accessoryId;
        }

        public CryptoKeyDataStoreException(String str, String str2) {
            super(str2);
            this.accessoryId = str;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InvalidInputsException extends CryptoKeyDataStoreException {
        private final Iterable<String> invalidFieldNames;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Accumulator {
            private final String accessoryId;
            private final ImmutableSet.Builder<String> fieldNameBuilder = ImmutableSet.builder();

            public Accumulator(String str) {
                this.accessoryId = str;
            }

            public Accumulator accumulateField(boolean z, String str) {
                if (!z) {
                    this.fieldNameBuilder.add((ImmutableSet.Builder<String>) str);
                    Logger.e("CryptoKeyDataStore.InvalidInputsException - Invalid Input Field: %s", str);
                }
                return this;
            }

            public void throwIfInvalid(String str) throws InvalidInputsException {
                ImmutableSet<String> build = this.fieldNameBuilder.build();
                if (build.isEmpty()) {
                    return;
                }
                StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(Strings.isNullOrEmpty(str) ? "" : BitVector$$ExternalSyntheticOutline0.m(str, "; "), "Field Names: ");
                m1m.append(Joiner.on(",").join(build));
                throw new InvalidInputsException(this.accessoryId, build, m1m.toString());
            }
        }

        public InvalidInputsException(String str, Iterable<String> iterable, String str2) {
            super(str, str2);
            this.invalidFieldNames = ImmutableSet.copyOf(iterable);
        }

        public static Accumulator accumulator(String str) {
            return new Accumulator(str);
        }

        public Iterable<String> getInvalidFieldNames() {
            return this.invalidFieldNames;
        }

        public InvalidInputsException(String str, Iterable<String> iterable, String str2, Throwable th) {
            this(str, iterable, str2);
            initCause(th);
        }
    }
}
