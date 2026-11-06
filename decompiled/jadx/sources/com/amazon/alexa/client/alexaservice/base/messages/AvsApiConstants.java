package com.amazon.alexa.client.alexaservice.base.messages;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.base.capabilities.ConversationCapability1_9Configuration;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionInterfaceName;
import com.amazon.alexa.client.core.capabilities.CapabilityInterface;
import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messages.Namespace;
import com.amazon.alexa.ra.core.data.fragments.Runtime;
import com.amazon.alexa.voice.tta.Constants;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class AvsApiConstants {
    public static final Set<Namespace> INTERNAL_CAPABILITY_AGENT_NAMESPACES;
    public static final Set<Namespace> INTERNAL_STATE_PROVIDER_NAMESPACES;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AccessoryKit {
        public static final Namespace NAMESPACE = Namespace.create(AccessoryKit.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(AccessoryKit.class.getSimpleName());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Alerts {
        public static final String SERVICE_CLASS = "com.amazon.alexa.alertsca.AlertsCapabilityAgentService";
        public static final String VERSION = "1.3";
        public static final Namespace NAMESPACE = Namespace.create(Alerts.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alerts.class.getSimpleName());
        public static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create(Alerts.class.getSimpleName());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Alexa {
        public static final String VERSION = "3.0";
        public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ApiGateway {
            public static final String VERSION = "1.0";
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + ApiGateway.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + ApiGateway.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static class Directives {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class SetGateway {
                    public static final Name NAME = Name.create(SetGateway.class.getSimpleName());
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Events {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class VerifyGateway {
                    public static final Name NAME = Name.create(VerifyGateway.class.getSimpleName());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ApplicationStateReporter {
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + ApplicationStateReporter.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + ApplicationStateReporter.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ComponentStates {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class ForegroundApplication {
                    public static final Name NAME = Name.create(ForegroundApplication.class.getSimpleName());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class AudioSignal {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ActiveNoiseControl {
                public static final CapabilityInterface CAPABILITY;
                public static final Namespace NAMESPACE;
                public static final String SERVICE_CLASS = "com.amazon.alexa.accessory.speechapi.voicesdk.capabilityagent.AmbientSoundCapabilityAgentService";
                public static final String VERSION = "1.0";

                static {
                    Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + AudioSignal.class.getSimpleName() + "." + ActiveNoiseControl.class.getSimpleName());
                    NAMESPACE = create;
                    CAPABILITY = CapabilityInterface.create(create.getValue());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Camera {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class AutoCaptureSessionController {
                public static final CapabilityInterface CAPABILITY;
                public static final Namespace NAMESPACE;
                public static final String VERSION = "1.0";

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class ComponentStates {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class SessionState {
                        public static final Name NAME = Name.create(SessionState.class.getSimpleName());
                    }
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Directives {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class Start {
                        public static final Name NAME = Name.create(Start.class.getSimpleName());
                    }

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class Stop {
                        public static final Name NAME = Name.create(Stop.class.getSimpleName());
                    }
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Events {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class SessionStartFailed {
                        public static final Name NAME = Name.create(SessionStartFailed.class.getSimpleName());
                    }

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class SessionStarted {
                        public static final Name NAME = Name.create(SessionStarted.class.getSimpleName());
                    }

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class SessionStopFailed {
                        public static final Name NAME = Name.create(SessionStopFailed.class.getSimpleName());
                    }

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class SessionStopped {
                        public static final Name NAME = Name.create(SessionStopped.class.getSimpleName());
                    }
                }

                static {
                    Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + Camera.class.getSimpleName() + "." + AutoCaptureSessionController.class.getSimpleName());
                    NAMESPACE = create;
                    CAPABILITY = CapabilityInterface.create(create.getValue());
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PhotoCaptureController {
                public static final CapabilityInterface CAPABILITY;
                public static final Namespace NAMESPACE;
                public static final String VERSION = "2.0";

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Directives {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class Capture {
                        public static final Name NAME = Name.create(Capture.class.getSimpleName());
                    }
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Events {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class CaptureFailed {
                        public static final Name NAME = Name.create(CaptureFailed.class.getSimpleName());
                    }

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class CaptureSucceeded {
                        public static final Name NAME = Name.create(CaptureSucceeded.class.getSimpleName());
                    }
                }

                static {
                    Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + Camera.class.getSimpleName() + "." + PhotoCaptureController.class.getSimpleName());
                    NAMESPACE = create;
                    CAPABILITY = CapabilityInterface.create(create.getValue());
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class VideoCaptureController {
                public static final CapabilityInterface CAPABILITY;
                public static final Namespace NAMESPACE;
                public static final String VERSION = "2.0";

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class ComponentStates {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class CaptureSessionState {
                        public static final Name NAME = Name.create(CaptureSessionState.class.getSimpleName());
                    }
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Directives {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class Start {
                        public static final Name NAME = Name.create(Start.class.getSimpleName());
                    }

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class Stop {
                        public static final Name NAME = Name.create(Stop.class.getSimpleName());
                    }
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Events {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class CaptureFailed {
                        public static final Name NAME = Name.create(CaptureFailed.class.getSimpleName());
                    }

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class CaptureStarted {
                        public static final Name NAME = Name.create(CaptureStarted.class.getSimpleName());
                    }

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class CaptureStopped {
                        public static final Name NAME = Name.create(CaptureStopped.class.getSimpleName());
                    }
                }

                static {
                    Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + Camera.class.getSimpleName() + "." + VideoCaptureController.class.getSimpleName());
                    NAMESPACE = create;
                    CAPABILITY = CapabilityInterface.create(create.getValue());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Comms {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PhoneCallController {
                public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + Comms.class.getSimpleName() + "." + PhoneCallController.class.getSimpleName());
                public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + Comms.class.getSimpleName() + "." + PhoneCallController.class.getSimpleName());

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class ComponentStates {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class PhoneCallControllerState {
                        public static final Name NAME = Name.create(PhoneCallControllerState.class.getSimpleName());
                    }
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Conversation {
            private static final String APL_TYPE_KEY = "APL";
            private static final String APL_TYPE_VALUE = "1.0";
            private static final String APL_VERSION_KEY = "aplVersion";
            private static final String APL_VERSION_VALUE = "2024.3";
            public static final CapabilityInterface CAPABILITY;
            private static final String CARD_TYPE_KEY = "Card";
            private static final String CARD_TYPE_VALUE = "1.0";
            public static final JsonObject CONFIGURATIONS;
            private static final String[][] CONVERSATION_CAPABILITY_CARD_TYPES = {new String[]{Constants.Namespaces.TEXT, "1.1"}, new String[]{"Button", "1.0"}, new String[]{"Image", "1.0"}, new String[]{"Suggestion", "1.0"}};
            public static final String CONVERSATION_UI_MISCELLANEOUS_NAMESPACE = "AlexaVoiceAndroidConversationUIMiscellaneous";
            private static final String FRAGMENT_VERSION_KEY = "fragmentVersion";
            private static final String FRAGMENT_VERSION_VALUE = "2024.1";
            private static final String FRAGMENT_VERSION_VALUE_17 = "2026.2";
            public static final String HOME_FRONTEND_NAMESPACE = "ALEXA_MOBILE_HOME_FRONTEND";
            public static final String MOSAIC_NAMESPACE = "MOSAIC";
            public static final String MULTIMODAL_ORCHESTRATOR_NAMESPACE = "MULTIMODAL_ORCHESTRATOR";
            private static final String NAME = "name";
            public static final Namespace NAMESPACE;
            public static final String SERVICE_CLASS = "com.amazon.alexa.ra.sdk.capability.ConversationCapability";
            private static final String SUPPORTED_FEATURES = "supportedFeatures";
            private static final String SUPPORTED_HTML_TYPES_KEY = "supportedHtmlTypes";
            private static final String TYPE = "type";
            public static final String VERSION = "1.5";
            private static final String VERSION_112 = "1.12";
            private static final String VERSION_17 = "1.7";
            private static final String VERSION_KEY = "version";

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static class Directives {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class AddFragments {
                    public static final Name NAME = Name.create(AddFragments.class.getSimpleName());
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public enum FeatureType {
                ALLOW_EXPAND,
                ALLOW_UPDATE,
                ALLOW_SCROLL_TO,
                POLL_FOR_DATA
            }

            static {
                Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + Conversation.class.getSimpleName());
                NAMESPACE = create;
                CAPABILITY = CapabilityInterface.create(create.getValue());
                Boolean bool = Boolean.FALSE;
                CONFIGURATIONS = createConversationConfigurations(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool);
            }

            private static JsonObject buildHtmlFragmentContentType() {
                JsonObject m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("type", "HTMLFragment", "version", "1.0");
                JsonArray jsonArray = new JsonArray();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("name", "mcp-app");
                jsonObject.addProperty("version", "1.0");
                jsonArray.add(jsonObject);
                m.add(SUPPORTED_HTML_TYPES_KEY, jsonArray);
                return m;
            }

            private static JsonObject createConversation17Configurations(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("fragmentVersion", FRAGMENT_VERSION_VALUE_17);
                JsonArray jsonArray = new JsonArray();
                JsonObject m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("type", "APLFragment", "version", "1.0");
                m.addProperty(Runtime.RUNTIME_VERSION, "2024.3");
                jsonArray.add(m);
                JsonObject jsonObject2 = new JsonObject();
                JsonArray jsonArray2 = new JsonArray();
                for (String[] strArr : CONVERSATION_CAPABILITY_CARD_TYPES) {
                    JsonObject jsonObject3 = new JsonObject();
                    jsonObject3.addProperty("type", strArr[0]);
                    jsonObject3.addProperty("version", strArr[1]);
                    jsonArray2.add(jsonObject3);
                }
                if (bool9 == null || !bool9.booleanValue()) {
                    if (bool3.booleanValue()) {
                        JsonObject jsonObject4 = new JsonObject();
                        jsonObject4.addProperty("type", "FullImage");
                        jsonObject4.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject4);
                    }
                    if (bool2.booleanValue()) {
                        JsonObject jsonObject5 = new JsonObject();
                        jsonObject5.addProperty("type", "Detail");
                        jsonObject5.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject5);
                    }
                    if (bool4.booleanValue()) {
                        JsonObject jsonObject6 = new JsonObject();
                        jsonObject6.addProperty("type", "Event");
                        jsonObject6.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject6);
                    }
                    if (bool5.booleanValue()) {
                        JsonObject jsonObject7 = new JsonObject();
                        jsonObject7.addProperty("type", "Headline");
                        jsonObject7.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject7);
                    }
                    if (bool6.booleanValue()) {
                        JsonObject jsonObject8 = new JsonObject();
                        jsonObject8.addProperty("type", "Navigation");
                        jsonObject8.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject8);
                    }
                    if (bool7.booleanValue()) {
                        JsonObject jsonObject9 = new JsonObject();
                        jsonObject9.addProperty("type", "Table");
                        jsonObject9.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject9);
                    }
                    if (bool8.booleanValue()) {
                        JsonObject jsonObject10 = new JsonObject();
                        jsonObject10.addProperty("type", "List");
                        jsonObject10.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject10);
                    }
                } else {
                    JsonObject m2 = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("type", "SmartFragment", "version", "1.0");
                    m2.addProperty(Runtime.RUNTIME_VERSION, FRAGMENT_VERSION_VALUE_17);
                    jsonArray.add(m2);
                }
                jsonObject2.add("cards", jsonArray2);
                jsonObject2.addProperty("type", CARD_TYPE_KEY);
                jsonObject2.addProperty("version", "1.0");
                jsonArray.add(jsonObject2);
                if (bool10 != null && bool10.booleanValue()) {
                    jsonArray.add(buildHtmlFragmentContentType());
                }
                JsonArray jsonArray3 = new JsonArray();
                if (bool.booleanValue()) {
                    JsonObject jsonObject11 = new JsonObject();
                    jsonObject11.addProperty("name", FeatureType.ALLOW_EXPAND.name());
                    jsonArray3.add(jsonObject11);
                }
                JsonObject jsonObject12 = new JsonObject();
                jsonObject12.addProperty("name", FeatureType.POLL_FOR_DATA.name());
                jsonArray3.add(jsonObject12);
                jsonObject.add("supportedContentTypes", jsonArray);
                jsonObject.add(SUPPORTED_FEATURES, jsonArray3);
                return jsonObject;
            }

            private static JsonObject createConversation19Configurations() {
                return ConversationCapability1_9Configuration.getConfiguration();
            }

            public static JsonObject createConversationConfigurations(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12) {
                if (bool12 != null && bool12.booleanValue()) {
                    return createConversation19Configurations();
                }
                if (bool11 != null && bool11.booleanValue()) {
                    return createConversation17Configurations(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10);
                }
                JsonObject m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(APL_VERSION_KEY, "2024.3", "fragmentVersion", "2024.1");
                JsonArray jsonArray = new JsonArray();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("type", APL_TYPE_KEY);
                jsonObject.addProperty("version", "1.0");
                jsonArray.add(jsonObject);
                JsonObject jsonObject2 = new JsonObject();
                JsonArray jsonArray2 = new JsonArray();
                for (String[] strArr : CONVERSATION_CAPABILITY_CARD_TYPES) {
                    JsonObject jsonObject3 = new JsonObject();
                    jsonObject3.addProperty("type", strArr[0]);
                    jsonObject3.addProperty("version", strArr[1]);
                    jsonArray2.add(jsonObject3);
                }
                if (bool9 == null || !bool9.booleanValue()) {
                    if (bool3.booleanValue()) {
                        JsonObject jsonObject4 = new JsonObject();
                        jsonObject4.addProperty("type", "FullImage");
                        jsonObject4.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject4);
                    }
                    if (bool2.booleanValue()) {
                        JsonObject jsonObject5 = new JsonObject();
                        jsonObject5.addProperty("type", "Detail");
                        jsonObject5.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject5);
                    }
                    if (bool4.booleanValue()) {
                        JsonObject jsonObject6 = new JsonObject();
                        jsonObject6.addProperty("type", "Event");
                        jsonObject6.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject6);
                    }
                    if (bool5.booleanValue()) {
                        JsonObject jsonObject7 = new JsonObject();
                        jsonObject7.addProperty("type", "Headline");
                        jsonObject7.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject7);
                    }
                    if (bool6.booleanValue()) {
                        JsonObject jsonObject8 = new JsonObject();
                        jsonObject8.addProperty("type", "Navigation");
                        jsonObject8.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject8);
                    }
                    if (bool7.booleanValue()) {
                        JsonObject jsonObject9 = new JsonObject();
                        jsonObject9.addProperty("type", "Table");
                        jsonObject9.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject9);
                    }
                    if (bool8.booleanValue()) {
                        JsonObject jsonObject10 = new JsonObject();
                        jsonObject10.addProperty("type", "List");
                        jsonObject10.addProperty("version", "1.0");
                        jsonArray2.add(jsonObject10);
                    }
                } else {
                    JsonObject m2 = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("type", "SmartFragment", "version", "1.0");
                    m2.addProperty(Runtime.RUNTIME_VERSION, FRAGMENT_VERSION_VALUE_17);
                    jsonArray.add(m2);
                }
                JsonArray jsonArray3 = new JsonArray();
                jsonObject2.add("cards", jsonArray2);
                jsonObject2.addProperty("type", CARD_TYPE_KEY);
                jsonObject2.addProperty("version", "1.0");
                jsonArray.add(jsonObject2);
                if (bool10 != null && bool10.booleanValue()) {
                    jsonArray.add(buildHtmlFragmentContentType());
                }
                if (bool.booleanValue()) {
                    JsonObject jsonObject11 = new JsonObject();
                    jsonObject11.addProperty("name", FeatureType.ALLOW_EXPAND.name());
                    jsonArray3.add(jsonObject11);
                }
                m.add("supportedContentTypes", jsonArray);
                m.add(SUPPORTED_FEATURES, jsonArray3);
                return m;
            }

            public static String getConversationVersion(Boolean bool, Boolean bool2, Boolean bool3) {
                return (bool2 == null || !bool2.booleanValue() || bool3 == null || !bool3.booleanValue()) ? (bool2 == null || !bool2.booleanValue()) ? (bool == null || !bool.booleanValue()) ? "1.5" : VERSION_17 : "1.9" : "1.12";
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Directives {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static class EventProcessed {
                public static final Name NAME = Name.create(EventProcessed.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Discovery {
            public static final String VERSION = "3.0";
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + Discovery.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + Discovery.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Events {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class AddOrUpdateReport {
                    public static final Name NAME = Name.create(AddOrUpdateReport.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class DeleteReport {
                    public static final Name NAME = Name.create(DeleteReport.class.getSimpleName());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Display {
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + Display.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + Display.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Window {
                public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + Display.class.getSimpleName() + "." + Window.class.getSimpleName());
                public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + Display.class.getSimpleName() + "." + Window.class.getSimpleName());

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class ComponentStates {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class WindowState {
                        public static final Name NAME = Name.create(WindowState.class.getSimpleName());
                    }
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class FavoritesController {
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + FavoritesController.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + FavoritesController.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static class Directives {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Favorite {
                    public static final Name NAME = Name.create(Favorite.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Unfavorite {
                    public static final Name NAME = Name.create(Unfavorite.class.getSimpleName());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class IOComponents {
            public static final String SERVICE_CLASS = "com.amazon.alexa.accessory.speechapi.voicesdk.capabilityagent.ReportAccessoryStateCapabilityAgentService";
            public static final String VERSION = "1.4";
            public static final String VERSION_V1_5 = "1.5";
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + IOComponents.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + IOComponents.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Bluetooth {
                public static final CapabilityInterface CAPABILITY;
                public static final Namespace NAMESPACE;
                public static final String SERVICE_CLASS = "com.amazon.alexa.seamlessswitching.capability.agent.IOComponentsBluetoothCapabilityAgentService";
                public static final String VERSION = "1.0";

                static {
                    Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + IOComponents.class.getSimpleName() + "." + Bluetooth.class.getSimpleName());
                    NAMESPACE = create;
                    CAPABILITY = CapabilityInterface.create(create.getValue());
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ComponentStates {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class IOComponentStates {
                    public static final Name NAME = Name.create(IOComponentStates.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class TrustedStates {
                    public static final Name NAME = Name.create(TrustedStates.class.getSimpleName());
                }
            }

            public static String getIOComponentsVersion(Boolean bool) {
                return (bool == null || !bool.booleanValue()) ? "1.4" : "1.5";
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Identity {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Recognition {
                public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + Identity.class.getSimpleName() + "." + Recognition.class.getSimpleName());
                public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + Identity.class.getSimpleName() + "." + Recognition.class.getSimpleName());

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class ComponentStates {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class RecognitionState {
                        public static final Name NAME = Name.create(RecognitionState.class.getSimpleName());
                    }
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class InteractionMode {
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + InteractionMode.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + InteractionMode.class.getSimpleName());
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Language {
            public static final CapabilityInterface CAPABILITY;
            public static final Namespace NAMESPACE;
            public static final String VERSION = "1.0";

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Directives {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class SetRequestedLocales {
                    public static final Name NAME = Name.create(SetRequestedLocales.class.getSimpleName());
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Events {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class RequestedLocalesChanged {
                    public static final Name NAME = Name.create(RequestedLocalesChanged.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class RequestedLocalesReport {
                    public static final Name NAME = Name.create(RequestedLocalesReport.class.getSimpleName());
                }
            }

            static {
                Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + Language.class.getSimpleName());
                NAMESPACE = create;
                CAPABILITY = CapabilityInterface.create(create.getValue());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Launcher {
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + Launcher.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + Launcher.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static class Directives {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class DisambiguateAndLaunchTarget {
                    public static final Name NAME = Name.create(DisambiguateAndLaunchTarget.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class LaunchTarget {
                    public static final Name NAME = Name.create(LaunchTarget.class.getSimpleName());
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Events {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class ErrorResponse {
                    public static final Name NAME = Name.create(ErrorResponse.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Response {
                    public static final Name NAME = Name.create(Response.class.getSimpleName());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Notifications {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class External {
                public static final CapabilityInterface CAPABILITY;
                public static final Namespace NAMESPACE;
                public static final String SERVICE_CLASS = "com.amazon.alexa.externalnotifications.capability.ExternalNotificationCapabilityAgentService";
                public static final String VERSION = "1.0";

                static {
                    Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + Notifications.class.getSimpleName() + "." + External.class.getSimpleName());
                    NAMESPACE = create;
                    CAPABILITY = CapabilityInterface.create(create.getValue());
                }
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Multipart {
                public static final CapabilityInterface CAPABILITY;
                public static final Namespace NAMESPACE;
                public static final String SERVICE_CLASS = "com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.AnnounceWithContentCapabilityAgentService";
                public static final String VERSION = "1.0";

                static {
                    Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + Notifications.class.getSimpleName() + "." + Multipart.class.getSimpleName());
                    NAMESPACE = create;
                    CAPABILITY = CapabilityInterface.create(create.getValue());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Personality {
            public static final CapabilityInterface CAPABILITY;
            public static final JsonObject CONFIGURATIONS;
            public static final Namespace NAMESPACE;
            private static final String PERSONALITIES_HEADER = "personalities";
            static final String[] PERSONALITY_CAPABILITY_PERSONALITIES;
            public static final String SERVICE_CLASS = "com.amazon.alexa.ra.sdk.capability.PersonalityCapability";
            public static final String VERSION = "1.0";

            static {
                String[] strArr = {"stagedir://personality/alarm", "stagedir://personality/alarm_2", "stagedir://personality/amazed", "stagedir://personality/applause", "stagedir://personality/bored", "stagedir://personality/bored_2", "stagedir://personality/calendar", "stagedir://personality/calendar_2", "stagedir://personality/cloudy", "stagedir://personality/comms", "stagedir://personality/dance", "stagedir://personality/dance_2", "stagedir://personality/directions", "stagedir://personality/done", "stagedir://personality/done_2", "stagedir://personality/dry", "stagedir://personality/ecstatic", "stagedir://personality/ecstatic_2", "stagedir://personality/excited", "stagedir://personality/fart", "stagedir://personality/fart_2", "stagedir://personality/flip_a_coin", "stagedir://personality/foggy", "stagedir://personality/fun_fact", "stagedir://personality/fun_fact_2", "stagedir://personality/games", "stagedir://personality/generative", "stagedir://personality/goodbye", "stagedir://personality/goodbye_2", "stagedir://personality/good_afternoon", "stagedir://personality/good_afternoon_2", "stagedir://personality/good_morning", "stagedir://personality/good_morning_2", "stagedir://personality/good_night", "stagedir://personality/good_night_2", "stagedir://personality/gratitude", "stagedir://personality/gratitude_2", "stagedir://personality/gratitude_3", "stagedir://personality/gratitude_4", "stagedir://personality/happy_birthday", "stagedir://personality/happy_birthday_2", "stagedir://personality/have_a_nice_day", "stagedir://personality/have_a_nice_day_2", "stagedir://personality/have_a_nice_day_3", "stagedir://personality/hello", "stagedir://personality/hello_2", "stagedir://personality/hello_3", "stagedir://personality/hello_4", "stagedir://personality/hello_5", "stagedir://personality/humid", "stagedir://personality/independence_day", "stagedir://personality/joke", "stagedir://personality/joyful", "stagedir://personality/joyful_2", "stagedir://personality/joyful_3", "stagedir://personality/lights_off", "stagedir://personality/lights_on", "stagedir://personality/list", "stagedir://personality/list_2", "stagedir://personality/lullaby", "stagedir://personality/monsoon", "stagedir://personality/movies", "stagedir://personality/music", "stagedir://personality/music_2", "stagedir://personality/music_3", "stagedir://personality/music_4", "stagedir://personality/news", "stagedir://personality/news_2", "stagedir://personality/peaceful", "stagedir://personality/photos", "stagedir://personality/photos_2", "stagedir://personality/playful", "stagedir://personality/podcast", "stagedir://personality/proud", "stagedir://personality/rainy", "stagedir://personality/reminders", "stagedir://personality/rock_paper_scissors", "stagedir://personality/rock_paper_scissors_2", "stagedir://personality/rock_paper_scissors_3", "stagedir://personality/sing", "stagedir://personality/snowy", "stagedir://personality/storytime", "stagedir://personality/storytime_2", "stagedir://personality/sunny", "stagedir://personality/sunny_2", "stagedir://personality/tease_me", "stagedir://personality/tease_me_2", "stagedir://personality/thank_you", "stagedir://personality/tickets", "stagedir://personality/timer", "stagedir://personality/timer_2", "stagedir://personality/video", "stagedir://personality/video_2", "stagedir://personality/warm_empathetic", "stagedir://personality/warm_empathetic_2", "stagedir://personality/what_is_your_name", "stagedir://personality/where_are_you", "stagedir://personality/where_are_you_2", "stagedir://personality/windy", "stagedir://personality/witty"};
                PERSONALITY_CAPABILITY_PERSONALITIES = strArr;
                Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + Personality.class.getSimpleName());
                NAMESPACE = create;
                CAPABILITY = CapabilityInterface.create(create.getValue());
                CONFIGURATIONS = createPersonalityConfigurations(strArr, "personalities");
            }

            private static JsonObject createPersonalityConfigurations(String[] strArr, String str) {
                JsonObject jsonObject = new JsonObject();
                JsonArray jsonArray = new JsonArray();
                for (String str2 : strArr) {
                    jsonArray.add(str2);
                }
                jsonObject.add(str, jsonArray);
                return jsonObject;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class PlaybackController {
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + PlaybackController.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + PlaybackController.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static class Directives {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class FastForward {
                    public static final Name NAME = Name.create(FastForward.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Next {
                    public static final Name NAME = Name.create(Next.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Pause {
                    public static final Name NAME = Name.create(Pause.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Play {
                    public static final Name NAME = Name.create(Play.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Previous {
                    public static final Name NAME = Name.create(Previous.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Rewind {
                    public static final Name NAME = Name.create(Rewind.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class StartOver {
                    public static final Name NAME = Name.create(StartOver.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Stop {
                    public static final Name NAME = Name.create(Stop.class.getSimpleName());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class PlaybackStateReporter {
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + PlaybackStateReporter.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + PlaybackStateReporter.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ComponentStates {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class PlaybackState {
                    public static final Name NAME = Name.create(PlaybackState.class.getSimpleName());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class PlaylistController {
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + PlaylistController.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + PlaylistController.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static class Directives {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class DisableRepeat {
                    public static final Name NAME = Name.create(DisableRepeat.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class DisableShuffle {
                    public static final Name NAME = Name.create(DisableShuffle.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class EnableRepeat {
                    public static final Name NAME = Name.create(EnableRepeat.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class EnableRepeatOne {
                    public static final Name NAME = Name.create(EnableRepeatOne.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class EnableShuffle {
                    public static final Name NAME = Name.create(EnableShuffle.class.getSimpleName());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Presentation {
            public static final CapabilityInterface CAPABILITY;
            public static final Namespace NAMESPACE;
            public static final String VERSION = "1.1";

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class APL {
                public static final CapabilityInterface CAPABILITY;
                public static final Namespace NAMESPACE;
                public static final String RUNTIME_MAX_VERSION = "2024.3";
                public static final String VERSION = "1.6";

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class ComponentStates {

                    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                    public static final class RenderedDocumentState {
                        public static final Name NAME = Name.create(RenderedDocumentState.class.getSimpleName());
                    }
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class Video {
                    public static final CapabilityInterface CAPABILITY;
                    public static final String CODEC_41 = "H_264_41";
                    public static final String CODEC_42 = "H_264_42";
                    public static final Namespace NAMESPACE;
                    public static final String VERSION = "1.0";

                    static {
                        String simpleName = Alexa.class.getSimpleName();
                        String simpleName2 = Presentation.class.getSimpleName();
                        String simpleName3 = APL.class.getSimpleName();
                        String simpleName4 = Video.class.getSimpleName();
                        StringBuilder m = TableInfo$$ExternalSyntheticOutline0.m(simpleName, ".", simpleName2, ".", simpleName3);
                        m.append(".");
                        m.append(simpleName4);
                        Namespace create = Namespace.create(m.toString());
                        NAMESPACE = create;
                        CAPABILITY = CapabilityInterface.create(create.getValue());
                    }
                }

                static {
                    Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + Presentation.class.getSimpleName() + "." + APL.class.getSimpleName());
                    NAMESPACE = create;
                    CAPABILITY = CapabilityInterface.create(create.getValue());
                }
            }

            static {
                Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + Presentation.class.getSimpleName());
                NAMESPACE = create;
                CAPABILITY = CapabilityInterface.create(create.getValue());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Recommendation {
            public static final CapabilityInterface CAPABILITY;
            public static final Namespace NAMESPACE;
            public static final String SERVICE_CLASS = "com.amazon.alexa.ra.sdk.capability.RecommendationCapability";
            public static final String VERSION = "1.0";

            static {
                Namespace create = Namespace.create(Alexa.class.getSimpleName() + "." + Recommendation.class.getSimpleName());
                NAMESPACE = create;
                CAPABILITY = CapabilityInterface.create(create.getValue());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class SeekController {
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + SeekController.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + SeekController.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static class Directives {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class AdjustSeekPosition {
                    public static final Name NAME = Name.create(AdjustSeekPosition.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class SetSeekPosition {
                    public static final Name NAME = Name.create(SetSeekPosition.class.getSimpleName());
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Shortcuts {
            public static final String SERVICE_CLASS = "com.amazon.alexa.shortcuts.shortcutscapabilityagent.ShortcutsCapabilityAgentService";
            public static final String VERSION = "1.0";
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + Shortcuts.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + Shortcuts.class.getSimpleName());
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Translation {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class LiveTranslation {
                public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + Translation.class.getSimpleName() + "." + LiveTranslation.class.getSimpleName());
                public static final String VERSION = "0.1";
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ApplicationManager {
        public static final Namespace NAMESPACE = Namespace.create(ApplicationManager.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(ApplicationManager.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Directives {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Navigation {
                public static final Name NAME = Name.create(Navigation.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AudioActivityTracker {
        public static final Namespace NAMESPACE = Namespace.create(AudioActivityTracker.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(AudioActivityTracker.class.getSimpleName());
        public static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create(AudioActivityTracker.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ComponentStates {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ActivityState {
                public static final Name NAME = Name.create(ActivityState.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AudioPlayer {
        public static final Namespace NAMESPACE = Namespace.create(AudioPlayer.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(AudioPlayer.class.getSimpleName());
        public static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create(AudioPlayer.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ComponentStates {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlaybackState {
                public static final Name NAME = Name.create(PlaybackState.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Directives {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ClearQueue {
                public static final Name NAME = Name.create(ClearQueue.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Play {
                public static final Name NAME = Name.create(Play.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Stop {
                public static final Name NAME = Name.create(Stop.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Events {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlaybackFailed {
                public static final Name NAME = Name.create(PlaybackFailed.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlaybackFinished {
                public static final Name NAME = Name.create(PlaybackFinished.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlaybackNearlyFinished {
                public static final Name NAME = Name.create(PlaybackNearlyFinished.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlaybackPaused {
                public static final Name NAME = Name.create(PlaybackPaused.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlaybackQueueCleared {
                public static final Name NAME = Name.create(PlaybackQueueCleared.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlaybackResumed {
                public static final Name NAME = Name.create(PlaybackResumed.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlaybackStarted {
                public static final Name NAME = Name.create(PlaybackStarted.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlaybackStopped {
                public static final Name NAME = Name.create(PlaybackStopped.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlaybackStutterFinished {
                public static final Name NAME = Name.create(PlaybackStutterFinished.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlaybackStutterStarted {
                public static final Name NAME = Name.create(PlaybackStutterStarted.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ProgressReportDelayElapsed {
                public static final Name NAME = Name.create(ProgressReportDelayElapsed.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ProgressReportIntervalElapsed {
                public static final Name NAME = Name.create(ProgressReportIntervalElapsed.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CardRenderer {
        public static final Namespace NAMESPACE = Namespace.create(CardRenderer.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(CardRenderer.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Directives {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlayerInfo {
                public static final Name NAME = Name.create(PlayerInfo.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class RenderCard {
                public static final Name NAME = Name.create(RenderCard.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ExternalMediaPlayer {
        public static final Namespace NAMESPACE = Namespace.create(ExternalMediaPlayer.class.getSimpleName());
        public static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create(ExternalMediaPlayer.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(ExternalMediaPlayer.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ComponentStates {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ExternalMediaPlayerState {
                public static final Name NAME = Name.create(ExternalMediaPlayerState.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Directives {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class AuthorizeDiscoveredPlayers {
                public static final Name NAME = Name.create(AuthorizeDiscoveredPlayers.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Login {
                public static final Name NAME = Name.create(Login.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Logout {
                public static final Name NAME = Name.create(Logout.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Play {
                public static final Name NAME = Name.create(Play.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlayFromSearch {
                public static final Name NAME = Name.create(PlayFromSearch.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Events {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class AuthorizationComplete {
                public static final Name NAME = Name.create(AuthorizationComplete.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlayerError {
                public static final Name NAME = Name.create(PlayerError.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlayerEvent {
                public static final Name NAME = Name.create(PlayerEvent.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ReportDiscoveredPlayers {
                public static final Name NAME = Name.create(ReportDiscoveredPlayers.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Geolocation {
        public static final Namespace NAMESPACE = Namespace.create(Geolocation.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Geolocation.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ComponentStates {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class GeolocationState {
                public static final Name NAME = Name.create(GeolocationState.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Header {
        public static final String EVENT_CORRELATION_TOKEN = "eventCorrelationToken";
        public static final String PRESENTATION_URI = "presentationUri";
        public static final String UNIVERSAL_PRIVACY_CODE = "upc";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Input {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Text {
            public static final Namespace NAMESPACE = Namespace.create(Alexa.class.getSimpleName() + "." + Input.class.getSimpleName() + "." + Text.class.getSimpleName());
            public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + Input.class.getSimpleName() + "." + Text.class.getSimpleName());

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Directives {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class ExpectText {
                    public static final Name NAME = Name.create(ExpectText.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class SetEndOfSpeechOffset {
                    public static final Name NAME = Name.create(SetEndOfSpeechOffset.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class StopCapture {
                    public static final Name NAME = Name.create(StopCapture.class.getSimpleName());
                }

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class TextMessage {
                    public static final Name NAME = Name.create(TextMessage.class.getSimpleName());
                }
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InteractionModel {
        public static final Namespace NAMESPACE = Namespace.create(InteractionModel.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(InteractionModel.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Directives {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class NewDialogRequest {
                public static final Name NAME = Name.create(NewDialogRequest.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class RequestProcessingCompleted {
                public static final Name NAME = Name.create(RequestProcessingCompleted.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class RequestProcessingStarted {
                public static final Name NAME = Name.create(RequestProcessingStarted.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LegacyFlags {
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(LegacyFlags.class.getSimpleName());
        public static final String VERSION = "0.1";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Navigation {
        public static final String SERVICE_CLASS = "com.amazon.alexa.hho.navigation.NavigationCapabilityAgentService";
        public static final String VERSION = "1.1";
        public static final Namespace NAMESPACE = Namespace.create(Navigation.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Navigation.class.getSimpleName());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NavigationManager {
        public static final Namespace NAMESPACE = Namespace.create(NavigationManager.class.getSimpleName());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Notifications {
        public static final Namespace NAMESPACE = Namespace.create(Notifications.class.getSimpleName());
        public static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create(Notifications.class.getSimpleName());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NotificationsApp {
        public static final Namespace NAMESPACE = Namespace.create(NotificationsApp.class.getSimpleName());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PlaybackController {
        public static final Namespace NAMESPACE = Namespace.create(PlaybackController.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(PlaybackController.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Events {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class NextCommandIssued {
                public static final Name NAME = Name.create(NextCommandIssued.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PauseCommandIssued {
                public static final Name NAME = Name.create(PauseCommandIssued.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PlayCommandIssued {
                public static final Name NAME = Name.create(PlayCommandIssued.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class PreviousCommandIssued {
                public static final Name NAME = Name.create(PreviousCommandIssued.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RTCSessionController {
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Alexa.class.getSimpleName() + "." + RTCSessionController.class.getSimpleName());
        public static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create(Alexa.class.getSimpleName() + "." + RTCSessionController.class.getSimpleName());
        public static final String SERVICE_CLASS = "com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceAVS";
        public static final String VERSION = "3.1";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RTVICapture {
        public static final JsonObject CONFIGURATIONS;
        public static final String SERVICE_CLASS = "com.amazon.rtvi.capabilityagent.avs.RTVICapabilityAgentService";
        public static final String VERSION = "1.0";
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create("Alexa.RTVI.Capture");
        public static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create("Alexa.RTVI.Capture");

        static {
            JsonObject jsonObject = new JsonObject();
            CONFIGURATIONS = jsonObject;
            JsonArray jsonArray = new JsonArray();
            jsonArray.add("DISCRETE");
            jsonArray.add("CONTINUOUS");
            jsonObject.add("commonCaptureModes", jsonArray);
            JsonArray jsonArray2 = new JsonArray();
            jsonArray2.add("AVS");
            jsonObject.add("commonTransmissionChannels", jsonArray2);
            JsonArray jsonArray3 = new JsonArray();
            jsonArray3.add("OCR_TEXT_RECOGNITION");
            jsonArray3.add("GESTURE_DETECTION");
            jsonArray3.add("FACE_DETECTION");
            jsonArray3.add("OPTICAL_MACHINE_READABLE_CODE_DETECTION");
            jsonObject.add("commonEnrichments", jsonArray3);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Settings {
        public static final Namespace NAMESPACE = Namespace.create(Settings.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Settings.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Events {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SettingsUpdated {
                public static final Name NAME = Name.create(SettingsUpdated.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SipClient {
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(SipClient.class.getSimpleName());
        public static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create(SipClient.class.getSimpleName());
        public static final String VERSION = "0.1";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Speaker {
        public static final Namespace NAMESPACE = Namespace.create(Speaker.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(Speaker.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ComponentStates {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class VolumeState {
                public static final Name NAME = Name.create(VolumeState.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Directives {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class AdjustVolume {
                public static final Name NAME = Name.create(AdjustVolume.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SetMute {
                public static final Name NAME = Name.create(SetMute.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SetVolume {
                public static final Name NAME = Name.create(SetVolume.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Events {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class MuteChanged {
                public static final Name NAME = Name.create(MuteChanged.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class VolumeChanged {
                public static final Name NAME = Name.create(VolumeChanged.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SpeechRecognizer {
        public static final Namespace NAMESPACE = Namespace.create(SpeechRecognizer.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(SpeechRecognizer.class.getSimpleName());
        public static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create(SpeechRecognizer.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ComponentStates {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class RecognizerState {
                public static final Name NAME = Name.create(RecognizerState.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Directives {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ExpectSpeech {
                public static final Name NAME = Name.create(ExpectSpeech.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SetEndOfSpeechOffset {
                public static final Name NAME = Name.create(SetEndOfSpeechOffset.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SetSpeechConfirmation {
                public static final Name NAME = Name.create(SetSpeechConfirmation.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SetWakeWordConfirmation {
                public static final Name NAME = Name.create(SetWakeWordConfirmation.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SetWakeWords {
                public static final Name NAME = Name.create(SetWakeWords.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class StopCapture {
                public static final Name NAME = Name.create(StopCapture.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Events {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Recognize {
                public static final Name NAME = Name.create(Recognize.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SpeechConfirmationChanged {
                public static final Name NAME = Name.create(SpeechConfirmationChanged.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SpeechConfirmationReported {
                public static final Name NAME = Name.create(SpeechConfirmationReported.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class WakeWordConfirmationChanged {
                public static final Name NAME = Name.create(WakeWordConfirmationChanged.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class WakeWordConfirmationReported {
                public static final Name NAME = Name.create(WakeWordConfirmationReported.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class WakeWordsChanged {
                public static final Name NAME = Name.create(WakeWordsChanged.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class WakeWordsReported {
                public static final Name NAME = Name.create(WakeWordsReported.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class LivePreview {
            public static final CapabilityInterface CAPABILITY;
            public static final Name NAME = Name.create(LivePreview.class.getSimpleName());
            public static final Namespace NAMESPACE;
            public static final String VERSION = "1.0";

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Directives {

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                public static final class ShowPreview {
                    public static final Name NAME = Name.create(ShowPreview.class.getSimpleName());
                }
            }

            static {
                Namespace create = Namespace.create(SpeechRecognizer.class.getSimpleName() + "." + LivePreview.class.getSimpleName());
                NAMESPACE = create;
                CAPABILITY = CapabilityInterface.create(create.getValue());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SpeechSynthesizer {
        public static final Namespace NAMESPACE = Namespace.create(SpeechSynthesizer.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(SpeechSynthesizer.class.getSimpleName());
        public static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create(SpeechSynthesizer.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ComponentStates {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SpeechState {
                public static final Name NAME = Name.create(SpeechState.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Directives {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class Speak {
                public static final Name NAME = Name.create(Speak.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Events {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SpeechFinished {
                public static final Name NAME = Name.create(SpeechFinished.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SpeechInterrupted {
                public static final Name NAME = Name.create(SpeechInterrupted.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SpeechStarted {
                public static final Name NAME = Name.create(SpeechStarted.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class System {
        public static final String VERSION = "1.4";
        public static final Namespace NAMESPACE = Namespace.create(System.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(System.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Directives {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ReportSoftwareInfo {
                public static final Name NAME = Name.create(ReportSoftwareInfo.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ReportState {
                public static final Name NAME = Name.create(ReportState.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ResetUserInactivity {
                public static final Name NAME = Name.create(ResetUserInactivity.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class RevokeAuthorization {
                public static final Name NAME = Name.create(RevokeAuthorization.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SetEndpoint {
                public static final Name NAME = Name.create(SetEndpoint.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SetLocales {
                public static final Name NAME = Name.create(SetLocales.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SetTimeZone {
                public static final Name NAME = Name.create(SetTimeZone.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class UpdateSettings {
                public static final Name NAME = Name.create(UpdateSettings.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Events {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ExceptionEncountered {
                public static final Name NAME = Name.create(ExceptionEncountered.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class LocalesChanged {
                public static final Name NAME = Name.create(LocalesChanged.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class LocalesReport {
                public static final Name NAME = Name.create(LocalesReport.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SettingsUpdated {
                public static final Name NAME = Name.create(SettingsUpdated.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SoftwareInfo {
                public static final Name NAME = Name.create(SoftwareInfo.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class StateReport {
                public static final Name NAME = Name.create(StateReport.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class SynchronizeState {
                public static final Name NAME = Name.create(SynchronizeState.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class TimeZoneChanged {
                public static final Name NAME = Name.create(TimeZoneChanged.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class TimeZoneReport {
                public static final Name NAME = Name.create(TimeZoneReport.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class UserInactivityReport {
                public static final Name NAME = Name.create(UserInactivityReport.class.getSimpleName());
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Exception {
            public static final Name NAME = Name.create(Exception.class.getSimpleName());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TemplateRuntime {
        public static final Namespace NAMESPACE = Namespace.create(TemplateRuntime.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(TemplateRuntime.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Directives {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class RenderPlayerInfo {
                public static final Name NAME = Name.create(RenderPlayerInfo.class.getSimpleName());
            }

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class RenderTemplate {
                public static final Name NAME = Name.create(RenderTemplate.class.getSimpleName());
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VisualActivityTracker {
        public static final Namespace NAMESPACE = Namespace.create(VisualActivityTracker.class.getSimpleName());
        public static final CapabilityInterface CAPABILITY = CapabilityInterface.create(VisualActivityTracker.class.getSimpleName());
        public static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create(VisualActivityTracker.class.getSimpleName());

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class ComponentStates {

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            public static final class ActivityState {
                public static final Name NAME = Name.create(ActivityState.class.getSimpleName());
            }
        }
    }

    static {
        Namespace namespace = SpeechRecognizer.NAMESPACE;
        Namespace namespace2 = AudioPlayer.NAMESPACE;
        Namespace namespace3 = AudioActivityTracker.NAMESPACE;
        Namespace namespace4 = Speaker.NAMESPACE;
        Namespace namespace5 = Geolocation.NAMESPACE;
        Namespace namespace6 = SpeechSynthesizer.NAMESPACE;
        Namespace namespace7 = ExternalMediaPlayer.NAMESPACE;
        INTERNAL_STATE_PROVIDER_NAMESPACES = new HashSet(Arrays.asList(namespace, namespace2, namespace3, namespace4, namespace5, namespace6, namespace7));
        INTERNAL_CAPABILITY_AGENT_NAMESPACES = new HashSet(Arrays.asList(namespace, namespace2, namespace4, Settings.NAMESPACE, System.NAMESPACE, namespace5, PlaybackController.NAMESPACE, TemplateRuntime.NAMESPACE, CardRenderer.NAMESPACE, namespace6, namespace7, SpeechRecognizer.LivePreview.NAMESPACE, Alexa.Language.NAMESPACE));
    }

    private static boolean inNamespace(Message message, Namespace namespace) {
        return namespace.equals(message.getHeader().getNamespace());
    }

    public static boolean isMessage(Namespace namespace, Name name, Message message) {
        return inNamespace(message, namespace) && isNamed(message, name);
    }

    private static boolean isNamed(Message message, Name name) {
        return name.equals(message.getHeader().getName());
    }
}
