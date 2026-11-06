package com.amazon.alexaext;

import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IExtension {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IExtensionActivityCommandResultCallback {
        void sendCommandResult(ActivityDescriptor activityDescriptor, String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IExtensionActivityEventCallback {
        boolean sendExtensionEvent(ActivityDescriptor activityDescriptor, String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public interface IExtensionCommandResultCallback {
        void sendCommandResult(String str, String str2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public interface IExtensionEventCallback {
        boolean sendExtensionEvent(String str, String str2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ILiveDataActivityUpdateCallback {
        boolean invokeLiveDataUpdate(ActivityDescriptor activityDescriptor, String str);
    }

    default String createRegistration(ActivityDescriptor activityDescriptor, String str) {
        return createRegistration(activityDescriptor.getURI(), str);
    }

    @Deprecated
    String createRegistration(String str, String str2);

    Set<String> getURIs();

    default boolean onCommand(ActivityDescriptor activityDescriptor, int i, String str) {
        return onCommand(i, activityDescriptor.getURI(), str);
    }

    default boolean onMessage(ActivityDescriptor activityDescriptor, String str) {
        return onMessage(activityDescriptor.getURI(), str);
    }

    default void onRegistered(ActivityDescriptor activityDescriptor) {
        onRegistered(activityDescriptor.getURI(), activityDescriptor.getActivityId());
    }

    default void onResourceReady(ActivityDescriptor activityDescriptor, ResourceHolder resourceHolder) {
        onResourceReady(activityDescriptor.getURI(), resourceHolder);
    }

    default void onUnregistered(ActivityDescriptor activityDescriptor) {
        onUnregistered(activityDescriptor.getURI(), activityDescriptor.getActivityId());
    }

    @Deprecated
    void registerCommandResultCallback(IExtensionCommandResultCallback iExtensionCommandResultCallback);

    @Deprecated
    void registerEventCallback(IExtensionEventCallback iExtensionEventCallback);

    @Deprecated
    void registerLiveDataUpdateCallback(ILiveDataUpdateCallback iLiveDataUpdateCallback);

    @Deprecated
    default void onResourceReady(String str, ResourceHolder resourceHolder) {
    }

    @Deprecated
    default boolean onCommand(int i, String str, String str2) {
        return false;
    }

    @Deprecated
    default boolean onMessage(String str, String str2) {
        return false;
    }

    @Deprecated
    default void onRegistered(String str, String str2) {
    }

    @Deprecated
    default void onUnregistered(String str, String str2) {
    }

    default void onBackground(ActivityDescriptor activityDescriptor) {
    }

    default void onForeground(ActivityDescriptor activityDescriptor) {
    }

    default void onHidden(ActivityDescriptor activityDescriptor) {
    }

    default void onSessionEnded(SessionDescriptor sessionDescriptor) {
    }

    default void onSessionStarted(SessionDescriptor sessionDescriptor) {
    }

    default void registerCommandResultCallback(IExtensionActivityCommandResultCallback iExtensionActivityCommandResultCallback) {
    }

    default void registerEventCallback(IExtensionActivityEventCallback iExtensionActivityEventCallback) {
    }

    default void registerLiveDataUpdateCallback(ILiveDataActivityUpdateCallback iLiveDataActivityUpdateCallback) {
    }
}
