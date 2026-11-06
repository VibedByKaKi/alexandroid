package com.amazon.dee.app.dependencies;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.benefits.view.routing.BenefitsRouting;
import com.amazon.alexa.biloba.routing.BilobaService;
import com.amazon.alexa.elements.routing.data.DefaultElementsRouteRegistry;
import com.amazon.alexa.elements.routing.data.ElementsRouteRegistry;
import com.amazon.alexa.entertainment.devicepicker.DevicePickerViewControllerFactory;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.routing.api.Route;
import com.amazon.alexa.routing.api.RoutingRegistry;
import com.amazon.alexa.routing.data.RouteName;
import com.amazon.alexa.routing.data.RouteUrls;
import com.amazon.coral.org.json.XML$$ExternalSyntheticBUOutline0;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.dee.app.core.R;
import com.amazon.dee.app.services.metrics.LatencyService;
import dagger.Module;
import dagger.Provides;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class RoutingModule {
    static final String CANTILEVER_VIEW_FACTORY = "com.amazon.alexa.cantilever.HelpViewControllerFactory";

    @VisibleForTesting
    static final int DEFAULT_ELEMENTS_PRIORITY = 50;

    @VisibleForTesting
    static final int DEFAULT_WEB_PRIORITY = 70;
    static final String HOME_VIEW_FACTORY = "com.amazon.alexa.redesign.view.container.HomeViewControllerFactory";
    static final String NAV_MORE_MENU_VIEW_FACTORY = "com.amazon.alexa.navigation.menu.NavigationViewControllerFactory";

    @VisibleForTesting
    static final String SMART_HOME_CAMERAS_QUALIFIED_NAME = "com.amazon.alexa.smarthomecameras.routing.CamerasViewControllerFactory";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle lambda$registerMainRoutes$0(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("tourDeeplink", "true");
        return bundle2;
    }

    private void registerAlexaDeviceSetupRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register("v2/alexa-oobe", 1).asRoot().withParent("main").withTemplate("v2/alexa-oobe");
        routingRegistry.register("v2/alexa-oobe/setupSpeaker", 1).asRoot().withParent("main").withTemplate("v2/alexa-oobe/setupSpeaker/{deviceSerial}/{deviceType}");
        routingRegistry.register("v2/alexa-oobe", 1).asRoot().withParent("main").withTemplate(RouteUrls.ELEMENTS_DEVICE_SETUP_COR);
        routingRegistry.register("v2/alexa-oobe", 1).asRoot().withParent("main").withTemplate(RouteUrls.ELEMENTS_DEVICE_SETUP_PFM);
        routingRegistry.register("v2/alexa-oobe", 1).asRoot().withParent("main").withTemplate(RouteUrls.ELEMENTS_DEVICE_SETUP_NEW_DEVICE);
        routingRegistry.register("v2/alexa-oobe", 1).asRoot().withParent("main").withTemplate(RouteUrls.ELEMENTS_DEVICE_SETUP_WELCOME);
        routingRegistry.register("v2/alexa-oobe/setupSpeakerBluetooth", 1).asRoot().withParent("main").withTemplate("v2/alexa-oobe/setupSpeakerBluetooth/{deviceSerial}/{deviceType}");
        routingRegistry.register("v2/alexa-oobe/speakerOptions", 1).asRoot().withParent("main").withTemplate("v2/alexa-oobe/speakerOptions/{deviceType}/{deviceSerial}");
        routingRegistry.register("v2/alexa-oobe/forcedWaitVideo", 1).asRoot().withParent("main").withTemplate("v2/alexa-oobe/forcedWaitVideo/{deviceSerial}");
        routingRegistry.register("v2/alexa-oobe/ftue-startup", 1).asRoot().withParent("main").withTemplate("v2/alexa-oobe/ftue-startup");
        routingRegistry.register("v2/alexa-oobe-speaker-pairing", 1).asRoot().withParent("main").withTemplate("v2/alexa-oobe-speaker-pairing").withTemplate("v2/alexa-oobe-speaker-pairing/{deviceSerial}/{deviceType}");
        routingRegistry.register("v2/alexa-oobe/forcedWaitVideo", 1).asRoot().withParent("main").withTemplate("v2/alexa-oobe/forcedWaitVideo/{deviceType}/{deviceSerial}/{isNewDevice}");
        routingRegistry.register("v2/alexa-oobe/postOobeFtue", 1).asRoot().withParent("main").withTemplate("v2/alexa-oobe/postOobeFtue/{deviceType}/{deviceSerialNumber}/{isNewDevice}");
    }

    private void registerBatteryOptimizationRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register(route("presence-battery-optimization", 11).withTemplate("presence-battery-optimization").asRoot().isOverlay().withParent("main").withContentMode(7).build());
    }

    private void registerBenefitsRoutes(RoutingRegistry routingRegistry) {
        Iterator<Route> it2 = BenefitsRouting.getAllRoutes().iterator();
        while (it2.hasNext()) {
            routingRegistry.register(it2.next());
        }
    }

    private void registerBilobaRoutes(RoutingRegistry routingRegistry) {
        Iterator<Route> it2 = BilobaService.getAllRoutes().iterator();
        while (it2.hasNext()) {
            routingRegistry.register(it2.next());
        }
    }

    private void registerCommsReactNativeRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register(route(RouteName.COMMS_CONTACT_CARD, 1).withParent("main").withTemplate("v2/comms/contact-card/{route_parameter}").withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.COMMS_MANAGE_CONTACTS, 1).withParent("v2/comms/conversation-list").withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.COMMS_IMPORT_CONTACT, 1).withParent("v2/comms/conversation-list").withHandleHeaderTitle().build());
        routingRegistry.register(route("v2/comms/conversation", 1).withParent("v2/comms/conversation-list").withTemplate("v2/comms/conversation/{id}").withContentMode(2).withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.COMMS_ANNOUNCEMENT, 1).withParent("v2/comms/conversation-list").withTemplate(RouteName.COMMS_ANNOUNCEMENT).withContentMode(2).withHandleHeaderTitle().build());
        routingRegistry.register(route("v2/comms/image-detail-view", 1).withParent("v2/comms/conversation").withTemplate("v2/comms/image-detail-view/{conversationId}?messageId={messageId}").withContentMode(2).withHandleHeaderTitle().build());
        routingRegistry.register(route("v2/comms/emergency-contacts-manage", 1).withParent(RouteName.MANAGE_CONTACT_LIST).withTemplate("v2/comms/emergency-contacts-manage").withHandleHeaderTitle().build());
        routingRegistry.register(route("v2/comms/emergency-contact-selector", 1).withParent("v2/comms/emergency-contacts-manage").withTemplate("v2/comms/emergency-contact-selector?shouldReturnBackOnComplete={shouldReturnBackOnComplete?}&primarySourceId={primarySourceId?}&externalSelectedContactId={externalSelectedContactId?}&externalSelectedContactCommsId={externalSelectedContactCommsId?}").withHandleHeaderTitle().build());
        routingRegistry.register(route("v2/comms/conversation-list", 1).withParent("conversations").withTemplate("v2/comms/conversation-list").withHandleHeaderTitle().build());
    }

    private void registerConversationRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register(route("conversations", 2).asRoot().withParent("main").build());
        routingRegistry.register(route(RouteName.CONVERSATIONS_CONTACT_LIST, 2).withParent("conversations").withHandleHeaderTitle().withContentMode(0).build());
        routingRegistry.register(route(RouteName.CONVERSATIONS_CONTACT, 2).withParent(RouteName.CONVERSATIONS_CONTACT_LIST).withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.EDIT_CONTACT_CARD, 2).withParent(RouteName.CONVERSATIONS_CONTACT).withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.CONVERSATIONS_DIAGNOSTICS, 2).withParent(RouteName.CONVERSATIONS_CONTACT).withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.MANAGE_CONTACT_LIST, 2).withParent(RouteName.CONVERSATIONS_CONTACT_LIST).withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.BLOCK_CONTACT_LIST, 2).withParent(RouteName.MANAGE_CONTACT_LIST).withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.CHILD_CONTACT_CARD, 2).withParent(RouteName.CONVERSATIONS_CONTACT).withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.WHITELIST_CONTACT, 2).withParent(RouteName.CONVERSATIONS_CONTACT).withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.RELATIONSHIP_LIST, 2).withParent(RouteName.CHILD_CONTACT_CARD).withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.EDIT_NICKNAME, 2).withParent(RouteName.CHILD_CONTACT_CARD).withHandleHeaderTitle().build());
        routingRegistry.register(route("v2/comms/contact-list", 2).withParent("conversations").withAlias("rn-contact-list").withHandleHeaderTitle().build());
        routingRegistry.register(route(RouteName.CONVERSATIONS_PATH, 2).withParent("conversations").doNotKeepInBackStack().withTemplate("conversations/{path}/start/{start}").build());
    }

    private void registerDevicePickerRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register(route("universal-device-picker", DevicePickerViewControllerFactory.class.getCanonicalName()).withTemplate("universal-device-picker").asRoot().withParent("main").build());
    }

    private void registerElementsRoutes(ElementsRouteRegistry elementsRouteRegistry, RoutingRegistry routingRegistry) {
        LatencyService.startElementsRouteRegistration();
        elementsRouteRegistry.registerRoutes(routingRegistry);
        LatencyService.endElementsRouteRegistration();
    }

    private void registerIdentityServicesRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register(route(RouteName.ELEMENTS_PROFILE_OOBE, 1).asRoot().withParent("main").withContentMode(2).withTemplate(RouteUrls.ELEMENTS_PROFILE_OOBE).build());
        routingRegistry.register(route(RouteName.ELEMENTS_PROFILE_TERMS, 1).asRoot().withParent("main").withContentMode(2).withTemplate(RouteUrls.ELEMENTS_PROFILE_TERMS).build());
    }

    private void registerMainRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register(route("main", 3).asRoot().build());
        routingRegistry.register(route("web", 0).asRoot().withParent("main").build());
        routingRegistry.register(route(RouteName.STARTUP, 0).asRoot().withParent("main").withTemplate(RouteName.STARTUP).build());
        routingRegistry.register(route("thingstotry", 0).asRoot().withHeaderTitle(Integer.valueOf(R.string.header_title_things_to_try)).withParent("main").withTemplate("help/thingstotry").build());
        routingRegistry.register(route(RouteName.MUSIC_BOOKS, 0).asRoot().withHeaderTitle(Integer.valueOf(R.string.header_title_music_video_books)).withParent("main").withTemplate("music/services").build());
        routingRegistry.register(route("settings", 0).asRoot().withHeaderTitle(Integer.valueOf(R.string.header_title_settings)).withParent("main").withTemplate("settings").build());
        routingRegistry.register(route(RouteName.NAV_MORE_MENU, NAV_MORE_MENU_VIEW_FACTORY).asRoot().withParent("main").withTemplate(RouteName.NAV_MORE_MENU).withContentMode(3).build());
        routingRegistry.register(route(RouteName.HELP, CANTILEVER_VIEW_FACTORY).asRoot().withParent("main").withHeaderTitle(Integer.valueOf(R.string.header_title_help)).withTemplate(RouteName.HELP).withAlias("help/node/{nodeId}").withAlias("help/call").withAlias("help/chat/{isChatRedirect}").withAlias("help/action/{cantileverIntent}").build());
        routingRegistry.register(route(RouteName.HELP_FULLSCREEN, CANTILEVER_VIEW_FACTORY).asRoot().withParent("main").withTemplate(RouteName.HELP).withContentMode(2).build());
        routingRegistry.register(route(RouteName.HELP_NAVBAR_ONLY, CANTILEVER_VIEW_FACTORY).asRoot().withParent("main").withHeaderTitle(Integer.valueOf(R.string.header_title_help)).withTemplate(RouteName.HELP).withAlias("helpNavBarOnly/node/{nodeId}").withAlias("helpNavBarOnly/call").withAlias("helpNavBarOnly/chat/{isChatRedirect}").withAlias("helpNavBarOnly/action/{cantileverIntent}").withContentMode(5).build());
        routingRegistry.register(route(RouteName.HOME, 6).asRoot().withHeaderTitle(Integer.valueOf(R.string.header_title_home)).withParent("main").withAlias("v2/home").withAlias("home/tour", new XML$$ExternalSyntheticBUOutline0(6)).withContentMode(3).build());
        routingRegistry.register(new Route.Builder(RouteName.DEV_MENU_ROUTE, "com.amazon.dee.app.devmenu.DevMenuViewController").asRoot().withHeaderTitle(Integer.valueOf(R.string.developer_menu_title)).withParent("main").build());
    }

    private void registerSimplifiedFeatureGroupRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register(route(RouteName.SMART_HOME, 1).asRoot().withHeaderTitle(Integer.valueOf(R.string.header_title_smartHome)).withParent("main").withTemplate(RouteUrls.SMART_HOME_INDEX).withAlias("smart-home").build());
        routingRegistry.register(route(RouteName.SMART_HOME_DISCOVER, 1).asRoot().withParent("main").withTemplate("v2/smart-home/indexWithDiscovery/true").withAlias("appliances/discover").build());
        routingRegistry.register(route("v2/smart-home/lemur-redirect/create", 1).asRoot().withParent("main").withTemplate("v2/smart-home/lemur-redirect/create").withAlias("lemur/newlemur").build());
        routingRegistry.register(route("v2/smart-home/lemur-redirect/list", 1).asRoot().withParent("main").withTemplate("v2/smart-home/lemur-redirect/list").withAlias("lemur/lemurclaw").build());
        routingRegistry.register(route(RouteName.REACT_NATIVE_COMMS, 1).asRoot().withParent("conversations").withTemplate("v2/comms/{route_parameter*}").withPriority(66).withAlias("rn-contacts-channels").build());
        routingRegistry.register(route(RouteName.REACT_NATIVE_COMMS, 1).asRoot().withParent("conversations").withContentMode(2).withAlias("rn-messaging-channels").build());
        routingRegistry.register(route("v2/settings/voice-purchasing", 1).asRoot().withParent("main").withTemplate("v2/settings/voice-purchasing").withAlias("settings/voice-purchasing").withAlias("v2/settings/voice-purchasing").build());
        routingRegistry.register(route(RouteName.ELEMENTS_SETTINGS_SHOPPING, 0).asRoot().withParent("main").withTemplate(RouteName.ELEMENTS_SETTINGS_SHOPPING).withAlias("v2/settings/shopping").withAlias("settings/voice-purchasing").build());
        routingRegistry.register(route("v2/settings/kid-skills-settings", 1).asRoot().withParent("main").withTemplate("v2/settings/kid-skills-settings").withAlias("settings/kid-skills-settings").withAlias("v2/settings/kid-skills-settings").build());
        routingRegistry.register(route(RouteName.ELEMENTS_SETTINGS_3P_ACCOUNT, 1).asRoot().withParent("main").withTemplate(RouteUrls.ELEMENTS_SETTINGS_3P_ACCOUNT).withAlias("settings/eon").withPriority(20).build());
        routingRegistry.register(route("videos", 1).asRoot().withParent("main").withTemplate(RouteUrls.VIDEO_INDEX).withAlias("videos/index").withPriority(5).build());
        routingRegistry.register(route("videos", 1).asRoot().withParent("main").withTemplate(RouteUrls.VIDEO_NESTED).withAlias("videos/{path*}").withPriority(5).build());
        routingRegistry.register(route("v2/reminders-alarms-timers", 1).asRoot().withParent("main").withTemplate("v2/reminders-alarms-timers").withAlias("timersAndAlarms").build());
        routingRegistry.register(route(RouteName.REMINDERS, 1).asRoot().withHeaderTitle(Integer.valueOf(R.string.header_title_reminders)).withParent("main").withTemplate(RouteUrls.ELEMENTS_REMINDERS).withAlias("timersAndAlarms/reminders").withAlias("timersAndAlarms/reminders?ref={ref}").build());
        routingRegistry.register(route(RouteName.ALARMS, 1).asRoot().withHeaderTitle(Integer.valueOf(R.string.header_title_alarms)).withParent("main").withTemplate(RouteUrls.ELEMENTS_ALARMS).withAlias("timersAndAlarms/alarms").withAlias("timersAndAlarms/alarms?ref={ref}").build());
        routingRegistry.register(route(RouteName.TIMERS, 1).asRoot().withHeaderTitle(Integer.valueOf(R.string.header_title_timers)).withParent("main").withTemplate(RouteUrls.ELEMENTS_TIMERS).withAlias("timersAndAlarms/timers").withAlias("timersAndAlarms/timers?ref={ref}").build());
        routingRegistry.register(route("locations/index", 1).asRoot().withParent("main").withTemplate("locations/index").withAlias("locations").build());
    }

    private void registerSmartHomeCamerasRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register(route(RouteName.SMART_HOME_CAMERAS_SMART_ALERTS_EVENT, SMART_HOME_CAMERAS_QUALIFIED_NAME).asRoot().withParent("main").withAlias(RouteName.SMART_HOME_CAMERAS_SMART_ALERTS_EVENT).withContentMode(2).withTemplate(RouteUrls.SMART_HOME_CAMERAS_SMART_ALERTS_EVENT).build());
        routingRegistry.register(route(RouteName.SMART_HOME_CAMERAS_LIVEVIEW, SMART_HOME_CAMERAS_QUALIFIED_NAME).asRoot().withParent("main").withAlias(RouteName.SMART_HOME_CAMERAS_LIVEVIEW).withContentMode(1).withTemplate(RouteUrls.SMART_HOME_CAMERAS_LIVEVIEW).build());
    }

    private void registerSmartHomeRoutes(RoutingRegistry routingRegistry) {
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.SMART_HOME_DEVICE_CONTROL, 1, "main", "v2/smart-home/devices/{entityId}", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.SMART_HOME_DEVICE_SETTING, 1, "main", "v2/smart-home/devices/{entityId}/settings", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.SMART_HOME_CMB_SETUP, 1, "main", "v2/smart-home/space-setup-page/{entityId}", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.SMART_HOME_NROOP_COMPLETE, 1, "main", "v2/smart-home/nroop-setup-complete-page", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.SMART_HOME_FFS_WIFI_CONNECTING, 1, "main", RouteUrls.WIFI_CONNECTING, routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.SMART_HOME_FFS_LANDING, 1, "main", "v2/smart-home/ffs/landing/{applianceType}", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.SMART_HOME_FFS_NEW_DEVICE_FOUND, 1, "main", "v2/smart-home/ffs/new-device-found-page", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.SMART_HOME_RED_ROCK_HISTORY, 1, "main", "v2/smart-home-redrock/profile-history-page", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.SMART_HOME_RED_ROCK_SETUP, 1, "main", "v2/smart-home-redrock/{path}", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/cameras/smart-alerts/dashboard-page", 1, "main", "v2/cameras/smart-alerts/dashboard-page", routingRegistry);
    }

    private void registerVoiceEnrollmentRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register(route("voice-enrollment-oobe", 7).withTemplate("voice-enrollment-oobe/{enrollmentContext?}").isOverlay().asRoot().withParent("main").build());
        routingRegistry.register(route("voice-enrollment", 7).withTemplate("voice-enrollment/{enrollmentContext?}").asRoot().isOverlay().withParent("main").build());
        routingRegistry.register(route("kids-enrollment", 19).withTemplate("kids-enrollment/{enrollmentContext}/{enrollmentMetadata}").asRoot().isOverlay().withParent("main").build());
        routingRegistry.register(route("v2/settings/recognized-voices", 1).withTemplate("v2/settings/recognized-voices").asRoot().withParent("main").build());
        routingRegistry.register(route("v2/settings/your-voice", 1).withTemplate("v2/settings/your-voice?ishandsfree={ishandsfree?}").asRoot().withParent("main").build());
        routingRegistry.register(route("v2/settings/recognize-speakers", 1).withTemplate("v2/settings/recognize-speakers").asRoot().withParent("main").build());
        routingRegistry.register(route(RouteName.ELEMENTS_WAKE_WORD_CHECK_ROUTE, 1).asRoot().withParent("main").withContentMode(2).withTemplate(RouteUrls.ELEMENTS_WAKE_WORD_CHECK_ROUTE).build());
    }

    private void registerVoiceRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register(route("voice-default-assistant", 5).withTemplate("voice-default-assistant").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("ampd-handsfree-settings", 10).withTemplate("ampd-handsfree-settings").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("ampd-handsfree-setup", 10).withTemplate("ampd-handsfree-setup").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("ampd-handsfree-oobe", 10).withTemplate("ampd-handsfree-oobe").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("ampd-handsfree-ftue", 10).withTemplate("ampd-handsfree-ftue").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("voice-ftue", 5).withTemplate("voice-ftue").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("type-to-alexa", 5).withTemplate("type-to-alexa").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("voice", 5).withTemplate("voice").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("alexa-conversations", 5).withTemplate("alexa-conversations").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("alexa-conversations/new", 5).withTemplate("alexa-conversations/new").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("new", 5).withTemplate("new").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("alexa-conversations/view", 5).withTemplate("alexa-conversations/view").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route("conversation/{conversationId}", 5).withTemplate("conversation/{conversationId}").asRoot().isOverlay().withParent("main").withContentMode(7).build());
        routingRegistry.register(route(RouteName.HANDSFREE_SETTINGS, 1).asRoot().withParent("main").withTemplate("v2/voice/handsfree-settings").build());
        routingRegistry.register(route(RouteName.LANGUAGE_SETTINGS, 1).asRoot().withParent("main").withTemplate(RouteUrls.LANGUAGE_SETTINGS).build());
    }

    private void registerWebRoutes(RoutingRegistry routingRegistry) {
        routingRegistry.register(route(RouteName.NOW_PLAYING, 0).withHeaderTitle(Integer.valueOf(R.string.header_title_nowPlaying)).withParent("main").withSingleChildRouteInBackStack().build());
        routingRegistry.register(route(RouteName.PLAYER_CURRENT, 0).asRoot().withTemplate("player").build()).withParentDefault(RouteName.NOW_PLAYING);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.PLAYER_QUEUE, 0, RouteName.NOW_PLAYING, "player/queue", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.PLAYER_HISTORY, 0, RouteName.NOW_PLAYING, "player/history", routingRegistry);
        routingRegistry.register(route(RouteName.LISTS, 0).asRoot().withHeaderTitle(Integer.valueOf(R.string.header_title_lists)).withParent("main").withTemplate(RouteName.LISTS).withSingleChildRouteInBackStack().build());
        routingRegistry.register(route(RouteName.LIST_SHOPPING, 0).asRoot().withHeaderTitle(Integer.valueOf(R.string.header_title_lists)).withParent(RouteName.LISTS).withTemplate("lists/shopping").build());
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.LISTS_NL, 0, RouteName.LISTS, "lists/namedLists", routingRegistry);
        routingRegistry.register(route(RouteName.LIST_TODO, 0).asRoot().withHeaderTitle(Integer.valueOf(R.string.header_title_lists)).withParent(RouteName.LISTS).withTemplate("lists/todos").build());
        routingRegistry.register(route(RouteName.FIRST_RUN_TUTORIAL, 0).asRoot().withParent("main").withTemplate("first-run-tutorial/{path*}").withContentMode(0).build());
    }

    @VisibleForTesting
    public static Route.Builder route(String str, int i) {
        return new Route.Builder(str, i).withPriority(i == 0 ? 70 : 50);
    }

    @Provides
    @ApplicationScope
    public ElementsRouteRegistry provideElementsRouteRegistry() {
        return new DefaultElementsRouteRegistry();
    }

    @Provides
    @ApplicationScope
    public RoutingRegistry provideRoutingRegistry(ElementsRouteRegistry elementsRouteRegistry) {
        Object obj;
        obj = ComponentRegistry.getInstance().get(RoutingRegistry.class).get();
        RoutingRegistry routingRegistry = (RoutingRegistry) obj;
        registerMainRoutes(routingRegistry);
        registerConversationRoutes(routingRegistry);
        registerWebRoutes(routingRegistry);
        registerVoiceRoutes(routingRegistry);
        registerBatteryOptimizationRoutes(routingRegistry);
        registerVoiceEnrollmentRoutes(routingRegistry);
        registerDevicePickerRoutes(routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/lists", 1, "main", "v2/lists", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/lists/archived", 1, "v2/lists", "v2/lists/archived", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.ELEMENTS_NAMED_LISTS_DETAIL, 1, "main", "v2/lists/namedlists/{path}", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.ELEMENTS_DEFAULT_LISTS_DETAIL, 1, "main", "v2/lists/redirect/{path}", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/reminders-alarms-timers", 1, "main", "v2/reminders-alarms-timers", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/reminders-alarms-timers/index-push/push", 1, "main", "v2/reminders-alarms-timers/index-push/push", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.ELEMENTS_REMINDERS_DETAIL, 1, "main", "v2/reminders-alarms-timers/reminders-detail/{path}", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.ELEMENTS_ALARM_EDIT, 1, "main", "v2/reminders-alarms-timers/alarm-edit/{path}", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.ELEMENTS_TIMER_DETAIL, 1, "main", "v2/reminders-alarms-timers/timer-detail/{path}", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/elements-hho-settings/permissions-diagnostic/ALARMS", 1, "main", "v2/elements-hho-settings/permissions-diagnostic/ALARMS", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/elements-hho-settings/permissions-diagnostic/REMINDERS", 1, "main", "v2/elements-hho-settings/permissions-diagnostic/REMINDERS", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/elements-hho-settings/permissions-diagnostic/TIMERS", 1, "main", "v2/elements-hho-settings/permissions-diagnostic/TIMERS", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/guided-discovery/add-devices", 1, "main", "v2/guided-discovery/add-devices", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.ACCESSORY_SETUP, 1, "main", RouteUrls.ACCESSORY_SETUP, routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/behaviors", 1, "main", "v2/behaviors", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/behaviors", 1, "main", RouteUrls.ROUTINES_GALLERY, routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("elements-hho-settings/kitchen-cooking-library-list", 1, "main", "elements-hho-settings/kitchen-cooking-library-list", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("elements-kitchen/kitchen-cooking-library-list", 1, "main", "elements-kitchen/kitchen-cooking-library-list", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/comms/comms-landing", 1, "main", "v2/comms/comms-landing", routingRegistry);
        routingRegistry.register(route("v2/homefeed", 1).asRoot().withParent("main").withAlias("cards").withAlias("activity").withTemplate("v2/homefeed").build());
        routingRegistry.register(route("v2/device-settings", 1).asRoot().withParent("main").withTemplate("v2/device-settings").build());
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.ELEMENTS_DEVICE_SETTINGS_DEEP_LINK, 1, "main", "v2/device-settings/legacy/{path}", routingRegistry);
        routingRegistry.register(route("v2/settings/notifications/drive-mode", 1).asRoot().withAlias("drive-mode/notification").withParent("main").withTemplate("v2/settings/notifications/drive-mode").build());
        registerAlexaDeviceSetupRoutes(routingRegistry);
        registerIdentityServicesRoutes(routingRegistry);
        routingRegistry.register(route(RouteName.ELEMENTS_SETTINGS, 1).asRoot().withParent("main").build());
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.ELEMENTS_SETTINGS_DEEP_LINK, 1, "main", "v2/settings/legacy/{path}", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.NOW_PLAYING_ELEMENTS, 1, "main", RouteUrls.NOW_PLAYING, routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.MUSIC_ELEMENTS, 1, "main", RouteUrls.MUSIC_ELEMENTS, routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.CHANNELS_DEVICES, 1, "main", RouteUrls.CHANNELS_DEVICES, routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/devices-channel/control-panel/all", 1, "main", "v2/devices-channel/control-panel/all", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m("v2/devices-channel/control-panel/space", 1, "main", "v2/devices-channel/control-panel/space/{groupId}", routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.CHANNELS_ENTERTAINMENT, 1, "main", RouteUrls.CHANNELS_ENTERTAINMENT, routingRegistry);
        CredentialConfig$$ExternalSyntheticOutline0.m(RouteName.COMMUNICATIONS_SETTING, 1, "main", "v2/device-settings/communications/{deviceSerial}/{deviceType}", routingRegistry);
        registerCommsReactNativeRoutes(routingRegistry);
        registerSmartHomeRoutes(routingRegistry);
        routingRegistry.register(route("skills", 1).asRoot().withParent("main").withTemplate("skills").withPriority(50).supportsDelegatedProfile().build());
        routingRegistry.register(route(RouteName.SKILLS_PAGES, 1).asRoot().withParent("main").withTemplate("skills/{path*}").withPriority(50).supportsDelegatedProfile().build());
        routingRegistry.register(route("rn", 1).asRoot().withParent("main").withTemplate("v2/{route_parameter*}").withPriority(69).build());
        routingRegistry.register(route("v2/hunches", 1).asRoot().withParent("main").withTemplate("v2/hunches").build());
        routingRegistry.register(route("v2/elements-notification-center/index", 1).asRoot().withParent("main").withTemplate("v2/elements-notification-center/index").build());
        CredentialConfig$$ExternalSyntheticOutline0.m("home-manager/view-invitation", 3, "main", "home-manager/view-invitation", routingRegistry);
        registerBilobaRoutes(routingRegistry);
        registerSmartHomeCamerasRoutes(routingRegistry);
        registerElementsRoutes(elementsRouteRegistry, routingRegistry);
        registerBenefitsRoutes(routingRegistry);
        registerSimplifiedFeatureGroupRoutes(routingRegistry);
        return routingRegistry;
    }

    @VisibleForTesting
    public static Route.Builder route(String str, String str2) {
        return new Route.Builder(str, str2);
    }
}
