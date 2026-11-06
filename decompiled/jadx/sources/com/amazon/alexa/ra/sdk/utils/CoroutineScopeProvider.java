package com.amazon.alexa.ra.sdk.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\b\fH&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/sdk/utils/CoroutineScopeProvider;", "", "getCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "launch", "Lkotlinx/coroutines/Job;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface CoroutineScopeProvider {
    @NotNull
    CoroutineScope getCoroutineScope();

    @NotNull
    Job launch(@NotNull CoroutineDispatcher dispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block);
}
