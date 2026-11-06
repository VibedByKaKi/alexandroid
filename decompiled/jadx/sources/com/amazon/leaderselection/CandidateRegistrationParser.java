package com.amazon.leaderselection;

import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.JsonReader;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CandidateRegistrationParser {
    private static final String ROLE_KEY = "role";
    private static final String VERSION_KEY = "version";
    private final PackageManager packageManager;

    public CandidateRegistrationParser(PackageManager packageManager) {
        this.packageManager = packageManager;
    }

    public CandidateRegistration parse(int i, ServiceInfo serviceInfo) {
        CandidateRegistration candidateRegistration;
        try {
            try {
                InputStream openRawResource = this.packageManager.getResourcesForApplication(serviceInfo.applicationInfo.packageName).openRawResource(i);
                try {
                    JsonReader jsonReader = new JsonReader(new InputStreamReader(openRawResource));
                    try {
                        CandidateRole candidateRole = CandidateRole.NONE;
                        LeaderSelectionServiceVersion leaderSelectionServiceVersion = LeaderSelectionServiceVersion.UNKNOWN;
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            int hashCode = nextName.hashCode();
                            if (hashCode != 3506294) {
                                if (hashCode == 351608024 && nextName.equals("version")) {
                                    leaderSelectionServiceVersion = LeaderSelectionServiceVersion.create(jsonReader.nextString());
                                }
                                jsonReader.skipValue();
                            } else if (nextName.equals("role")) {
                                candidateRole = CandidateRole.create(jsonReader.nextString());
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        if (CandidateRole.NONE != candidateRole && !LeaderSelectionServiceVersion.UNKNOWN.equals(leaderSelectionServiceVersion)) {
                            candidateRegistration = CandidateRegistration.create(candidateRole, leaderSelectionServiceVersion);
                            jsonReader.close();
                            if (openRawResource == null) {
                                return candidateRegistration;
                            }
                            openRawResource.close();
                            return candidateRegistration;
                        }
                        Log.e("ContentValues", "Candidate registration was invalid: " + candidateRole + " " + leaderSelectionServiceVersion);
                        candidateRegistration = CandidateRegistration.UNKNOWN;
                        jsonReader.close();
                        if (openRawResource == null) {
                            return candidateRegistration;
                        }
                        openRawResource.close();
                        return candidateRegistration;
                    } finally {
                    }
                } catch (Throwable th) {
                    if (openRawResource != null) {
                        try {
                            openRawResource.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (UnsupportedEncodingException e) {
                Log.e("ContentValues", "Cannot convert data in format", e);
                return CandidateRegistration.UNKNOWN;
            } catch (IOException e2) {
                Log.e("ContentValues", "Failed to parse registration", e2);
                return CandidateRegistration.UNKNOWN;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ContentValues", "Name of the package was not found");
            return CandidateRegistration.UNKNOWN;
        }
    }
}
