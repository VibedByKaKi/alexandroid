package com.amazon.rtcmedia.webrtc;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import com.amazon.rtcmedia.util.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.CodecConfigInfo;
import org.webrtc.CommsDefaultVideoDecoderFactory;
import org.webrtc.CommsDefaultVideoEncoderFactory;
import org.webrtc.CommsHardwareVideoDecoderFactory;
import org.webrtc.CommsHardwareVideoEncoderFactory;
import org.webrtc.DecoderMetricsSink;
import org.webrtc.DefaultVideoDecoderFactory;
import org.webrtc.DefaultVideoEncoderFactory;
import org.webrtc.EglBase;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Predicate;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PeerConnectionFactoryWrapper {
    private static volatile PeerConnectionFactoryWrapper factoryWrapper;
    private static Logger mLog = Logger.getLogger(PeerConnectionFactoryWrapper.class);
    private static int refCount = 0;
    private static PeerConnectionFactory factory = null;
    private static boolean isVideoCapable = false;

    private PeerConnectionFactoryWrapper() {
    }

    public static void dispose() {
        mLog.i("dispose");
        synchronized (PeerConnectionFactoryWrapper.class) {
            try {
                Logger logger = mLog;
                Locale locale = Locale.US;
                logger.d("Refcount is: " + refCount);
                int i = refCount;
                if (i > 0) {
                    refCount = i - 1;
                }
                if (refCount == 0) {
                    PeerConnectionFactory.stopInternalTracingCapture();
                    PeerConnectionFactory.shutdownInternalTracer();
                    if (factoryWrapper != null) {
                        PeerConnectionFactory peerConnectionFactory = factory;
                        if (peerConnectionFactory != null) {
                            peerConnectionFactory.dispose();
                            factory = null;
                            mLog.i("Destroyed peer connection factory.");
                        }
                        factoryWrapper = null;
                        mLog.i("Destroyed peer connection factory wrapper.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static PeerConnectionFactoryWrapper getOrCreateInstance(Context context, boolean z, String str, EglBase.Context context2, EglBase.Context context3, boolean z2, List<CodecConfigInfo> list, Predicate<MediaCodecInfo> predicate, boolean z3, DecoderMetricsSink decoderMetricsSink) {
        mLog.i("getOrCreateInstance");
        synchronized (PeerConnectionFactoryWrapper.class) {
            try {
                if (factoryWrapper == null) {
                    factoryWrapper = new PeerConnectionFactoryWrapper();
                    PeerConnectionFactory.InitializationOptions.Builder enableInternalTracer = PeerConnectionFactory.InitializationOptions.builder(context).setEnableInternalTracer(z2);
                    if (!TextUtils.isEmpty(str)) {
                        enableInternalTracer.setFieldTrials(str);
                    }
                    PeerConnectionFactory.initialize(enableInternalTracer.createInitializationOptions());
                    if (z) {
                        CommsHardwareVideoEncoderFactory commsHardwareVideoEncoderFactory = new CommsHardwareVideoEncoderFactory(context2, true, list, predicate);
                        CommsHardwareVideoDecoderFactory commsHardwareVideoDecoderFactory = new CommsHardwareVideoDecoderFactory(context2, list, predicate, z3, decoderMetricsSink);
                        factory = PeerConnectionFactory.builder().setForceInternalAudioDeviceIfNotProvided(true).setVideoEncoderFactory(new CommsDefaultVideoEncoderFactory(commsHardwareVideoEncoderFactory)).setVideoDecoderFactory(new CommsDefaultVideoDecoderFactory(commsHardwareVideoDecoderFactory)).createPeerConnectionFactory();
                    } else {
                        mLog.i("Creating peer connection factory with default codec factory");
                        factory = PeerConnectionFactory.builder().setForceInternalAudioDeviceIfNotProvided(true).setVideoEncoderFactory(new DefaultVideoEncoderFactory(context2, true, false)).setVideoDecoderFactory(new DefaultVideoDecoderFactory(context2)).createPeerConnectionFactory();
                    }
                    isVideoCapable = z;
                    mLog.i("Created peer connection factory.");
                }
                refCount++;
                Logger logger = mLog;
                Locale locale = Locale.US;
                logger.d("Refcount is: " + refCount);
            } catch (Throwable th) {
                throw th;
            }
        }
        return factoryWrapper;
    }

    public AudioSource createAudioSource(MediaConstraints mediaConstraints) {
        mLog.i("createAudioSource");
        AudioSource audioSource = null;
        if (mediaConstraints == null) {
            mLog.e("Constraints are null. Not creating audio source.");
            return null;
        }
        synchronized (PeerConnectionFactoryWrapper.class) {
            try {
                PeerConnectionFactory peerConnectionFactory = factory;
                if (peerConnectionFactory != null) {
                    audioSource = peerConnectionFactory.createAudioSource(mediaConstraints);
                } else {
                    mLog.e("Factory is null. Not creating audio source.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return audioSource;
    }

    public AudioTrack createAudioTrack(String str, AudioSource audioSource) {
        mLog.i("createAudioTrack");
        AudioTrack audioTrack = null;
        if (TextUtils.isEmpty(str) || audioSource == null) {
            mLog.e("One or more parameters are null. Not creating audio track.");
            return null;
        }
        synchronized (PeerConnectionFactoryWrapper.class) {
            try {
                PeerConnectionFactory peerConnectionFactory = factory;
                if (peerConnectionFactory != null) {
                    audioTrack = peerConnectionFactory.createAudioTrack(str, audioSource);
                } else {
                    mLog.e("Factory is null. Not creating audio track.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return audioTrack;
    }

    public MediaStream createLocalMediaStream(String str) {
        mLog.i("createLocalMediaStream");
        MediaStream mediaStream = null;
        if (str.isEmpty()) {
            mLog.e("Label is empty. Not creating local media stream.");
            return null;
        }
        synchronized (PeerConnectionFactoryWrapper.class) {
            try {
                PeerConnectionFactory peerConnectionFactory = factory;
                if (peerConnectionFactory != null) {
                    mediaStream = peerConnectionFactory.createLocalMediaStream(str);
                } else {
                    mLog.e("Factory is null. Not creating local media stream.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaStream;
    }

    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, PeerConnection.Observer observer) {
        mLog.i("createPeerConnection");
        PeerConnection peerConnection = null;
        if (rTCConfiguration == null || mediaConstraints == null || observer == null) {
            mLog.e("One or more parameters are null. Not creating peer connection.");
            return null;
        }
        synchronized (PeerConnectionFactoryWrapper.class) {
            try {
                PeerConnectionFactory peerConnectionFactory = factory;
                if (peerConnectionFactory != null) {
                    peerConnection = peerConnectionFactory.createPeerConnection(rTCConfiguration, mediaConstraints, observer);
                } else {
                    mLog.e("Factory is null. Not creating peer connection.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return peerConnection;
    }

    public VideoSource createVideoSource(VideoCapturer videoCapturer) {
        mLog.i("createVideoSource");
        VideoSource videoSource = null;
        if (videoCapturer == null) {
            mLog.e("Video capturer is null. Not creating video source.");
            return null;
        }
        synchronized (PeerConnectionFactoryWrapper.class) {
            try {
                PeerConnectionFactory peerConnectionFactory = factory;
                if (peerConnectionFactory != null) {
                    videoSource = peerConnectionFactory.createVideoSource(videoCapturer.isScreencast());
                } else {
                    mLog.e("Factory is null. Not creating video source.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return videoSource;
    }

    public VideoTrack createVideoTrack(String str, VideoSource videoSource) {
        mLog.i("createVideoTrack");
        VideoTrack videoTrack = null;
        if (videoSource == null) {
            mLog.e("Video source is null. Not creating video track.");
            return null;
        }
        synchronized (PeerConnectionFactoryWrapper.class) {
            try {
                PeerConnectionFactory peerConnectionFactory = factory;
                if (peerConnectionFactory != null) {
                    videoTrack = peerConnectionFactory.createVideoTrack(str, videoSource);
                } else {
                    mLog.e("Factory is null. Not creating video track.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return videoTrack;
    }

    public PeerConnectionFactory getFactory() {
        PeerConnectionFactory peerConnectionFactory;
        mLog.i("getFactory");
        synchronized (PeerConnectionFactoryWrapper.class) {
            peerConnectionFactory = factory;
        }
        return peerConnectionFactory;
    }

    public boolean startAecDump(int i, int i2) {
        boolean z;
        mLog.i("startAecDump");
        synchronized (PeerConnectionFactoryWrapper.class) {
            try {
                PeerConnectionFactory peerConnectionFactory = factory;
                if (peerConnectionFactory != null) {
                    z = peerConnectionFactory.startAecDump(i, i2);
                } else {
                    mLog.e("Factory is null. Not starting AEC dump.");
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void stopAecDump() {
        mLog.i("stopAecDump");
        synchronized (PeerConnectionFactoryWrapper.class) {
            try {
                PeerConnectionFactory peerConnectionFactory = factory;
                if (peerConnectionFactory != null) {
                    peerConnectionFactory.stopAecDump();
                } else {
                    mLog.e("Factory is null. Not stopping AEC dump.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static PeerConnectionFactoryWrapper getOrCreateInstance(Context context, boolean z, String str, EglBase.Context context2, EglBase.Context context3, boolean z2, List<CodecConfigInfo> list, Predicate<MediaCodecInfo> predicate) {
        return getOrCreateInstance(context, z, str, context2, context3, z2, list, predicate, false, null);
    }

    public static PeerConnectionFactoryWrapper getOrCreateInstance(Context context, boolean z, String str, EglBase.Context context2, EglBase.Context context3, boolean z2) {
        return getOrCreateInstance(context, z, str, context2, context3, z2, new ArrayList(), null);
    }
}
