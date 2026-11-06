package com.amazon.alexa.client.alexaservice.vad.intent;

import ai.onnxruntime.OnnxTensor;
import ai.onnxruntime.OrtEnvironment;
import ai.onnxruntime.OrtException;
import ai.onnxruntime.OrtSession;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.client.alexaservice.vad.OnnxRuntimeEnvironment;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ExitIntentClassifier {
    private static final float CONFIDENCE_GATE = 0.9f;
    private static final int LABEL_EXIT = 2;
    private static final int LABEL_MUTE = 1;
    private static final int LABEL_NONE = 0;
    private static final int MAX_LEN = 24;
    private static final String MODEL_PATH = "exit_intent_model_int8.onnx";
    private static final String OUTER_PUNCT_CHARS = ".,!?;:\"'()[]{}…—–-";
    private static final int PAD_TOKEN = 0;
    private static final String TAG = "ExitIntentClassifier";
    private static final int UNK_TOKEN = 1;
    private static final String VOCAB_PATH = "exit_intent_vocab.json";
    private final Context context;
    private volatile boolean initialized;
    private OrtEnvironment ortEnvironment;
    private OrtSession ortSession;
    private Map<String, Integer> vocab;
    private static final Pattern WORD_TOKEN_REGEX = Pattern.compile("\\b\\w+(?:'\\w+)?\\b");
    private static final Pattern INTERNAL_PUNCT_REGEX = Pattern.compile("[,:;]+\\s+");
    private static final List<String> LEADING_INTERJECTIONS = Arrays.asList("yeah ", "yes ", "ok ", "okay ", "alright ", "sure ", "so ", "well ", "um ", "uh ", "hmm ", "oh ", "hey ");
    private static final List<String> TRAILING_ACKS = Arrays.asList(" ok", " okay", " yeah", " yes", " sure");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Outcome {
        NONE,
        MUTE,
        EXIT,
        LOW_CONFIDENCE,
        MODEL_LOAD_FAILED,
        INFERENCE_FAILED
    }

    @Inject
    public ExitIntentClassifier(@NonNull Context context) {
        this.context = context;
    }

    private byte[] loadAsset(@NonNull Context context, @NonNull String str) throws IOException {
        InputStream open = context.getAssets().open(str);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    open.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private Map<String, Integer> loadVocab(@NonNull Context context) throws IOException {
        return (Map) new Gson().fromJson(new String(loadAsset(context, "exit_intent_vocab.json"), StandardCharsets.UTF_8), new TypeToken<Map<String, Integer>>() { // from class: com.amazon.alexa.client.alexaservice.vad.intent.ExitIntentClassifier.1
        }.getType());
    }

    private float[] runInference(long[] jArr) throws OrtException {
        long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 1, 24);
        jArr2[0] = jArr;
        int length = jArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length && jArr[i2] != 0; i2++) {
            i++;
        }
        if (i == 0) {
            i = 1;
        }
        long[] jArr3 = {i};
        OnnxTensor createTensor = OnnxTensor.createTensor(this.ortEnvironment, jArr2);
        try {
            OnnxTensor createTensor2 = OnnxTensor.createTensor(this.ortEnvironment, jArr3);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(ContactsModuleConstants.CONTACT_IDS, createTensor);
                hashMap.put("lengths", createTensor2);
                OrtSession.Result run = this.ortSession.run(hashMap);
                try {
                    float[] fArr = ((float[][]) run.get(0).getValue())[0];
                    run.close();
                    if (createTensor2 != null) {
                        createTensor2.close();
                    }
                    if (createTensor != null) {
                        createTensor.close();
                    }
                    return fArr;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            if (createTensor != null) {
                try {
                    createTensor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public synchronized Outcome classify(@NonNull String str) {
        if (!this.initialized) {
            Log.w(TAG, "Classifier not initialized");
            return Outcome.MODEL_LOAD_FAILED;
        }
        try {
            float[] runInference = runInference(tokenize(preprocess(str)));
            float f = runInference[0];
            float f2 = runInference[1];
            float f3 = runInference[2];
            if (f3 >= 0.9f) {
                return Outcome.EXIT;
            }
            if (f2 >= 0.9f) {
                return Outcome.MUTE;
            }
            return (f < f2 || f < f3) ? Outcome.LOW_CONFIDENCE : Outcome.NONE;
        } catch (Exception e) {
            Log.e(TAG, "Inference failed", e);
            return Outcome.INFERENCE_FAILED;
        }
    }

    public synchronized void initialize() {
        if (this.initialized) {
            return;
        }
        try {
            this.ortEnvironment = OnnxRuntimeEnvironment.get();
            this.ortSession = this.ortEnvironment.createSession(loadAsset(this.context, "exit_intent_model_int8.onnx"));
            this.vocab = loadVocab(this.context);
            this.initialized = true;
            Log.i(TAG, "Exit intent classifier initialized (vocab size: " + this.vocab.size() + MarkdownConstants.RIGHT_PARENTHESIS);
        } catch (Error | Exception e) {
            Log.e(TAG, "Failed to initialize exit intent classifier", e);
            release();
        }
    }

    public synchronized boolean isExitIntent(@NonNull String str) {
        return classify(str) == Outcome.EXIT;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    @VisibleForTesting
    public String preprocess(@NonNull String str) {
        boolean z;
        String trim = str.toLowerCase(Locale.ROOT).trim();
        while (!trim.isEmpty() && OUTER_PUNCT_CHARS.indexOf(trim.charAt(0)) >= 0) {
            trim = trim.substring(1);
        }
        while (!trim.isEmpty() && OUTER_PUNCT_CHARS.indexOf(trim.charAt(trim.length() - 1)) >= 0) {
            trim = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, trim);
        }
        String replaceAll = INTERNAL_PUNCT_REGEX.matcher(trim.trim()).replaceAll(" ");
        for (int i = 0; i < 2; i++) {
            Iterator<String> it2 = LEADING_INTERJECTIONS.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                String next = it2.next();
                if (replaceAll.startsWith(next)) {
                    replaceAll = replaceAll.substring(next.length());
                    z = true;
                    break;
                }
            }
            if (!z) {
                break;
            }
        }
        String trim2 = replaceAll.trim();
        for (String str2 : TRAILING_ACKS) {
            if (trim2.endsWith(str2)) {
                String trim3 = trim2.substring(0, trim2.length() - str2.length()).trim();
                while (!trim3.isEmpty() && OUTER_PUNCT_CHARS.indexOf(trim3.charAt(trim3.length() - 1)) >= 0) {
                    trim3 = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, trim3);
                }
                return trim3.trim();
            }
        }
        return trim2;
    }

    public synchronized void release() {
        OrtSession ortSession = this.ortSession;
        if (ortSession != null) {
            try {
                ortSession.close();
            } catch (OrtException e) {
                Log.w(TAG, "Error closing session", e);
            }
            this.ortSession = null;
        }
        this.ortEnvironment = null;
        this.vocab = null;
        this.initialized = false;
    }

    @VisibleForTesting
    public long[] tokenize(@NonNull String str) {
        long[] jArr = new long[24];
        if (this.vocab == null) {
            jArr[0] = 1;
            return jArr;
        }
        List<String> list = tokenizeWords(str);
        if (list.isEmpty()) {
            jArr[0] = 1;
            return jArr;
        }
        int min = Math.min(list.size(), 24);
        for (int i = 0; i < min; i++) {
            jArr[i] = this.vocab.getOrDefault(list.get(i), 1).intValue();
        }
        return jArr;
    }

    @VisibleForTesting
    public List<String> tokenizeWords(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = WORD_TOKEN_REGEX.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }
}
