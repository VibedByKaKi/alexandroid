package com.amazon.alexa.mobilytics.integration.ama.resourcestat.cpu;

import android.app.ActivityManager;
import android.os.SystemClock;
import com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStat;
import com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStatType;
import com.amazon.alexa.mobilytics.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class CpuStat implements MobilyticsResourceStat {
    private static final int MS_PER_SYSTEM_CLK_TCK = 10;
    private static final String TAG = Log.tag((Class<?>) CpuStat.class);
    long csTime;
    long cuTime;
    long sTime;
    int threadCount;
    long totalCpuTicks;
    long totalTicks;
    long uTime;

    public CpuStat(List<ActivityManager.RunningAppProcessInfo> list) {
        this.uTime = 0L;
        this.sTime = 0L;
        this.cuTime = 0L;
        this.csTime = 0L;
        this.threadCount = 0;
        this.totalCpuTicks = 0L;
        this.totalTicks = SystemClock.elapsedRealtime() / 10;
        init(list);
    }

    private void init(List<ActivityManager.RunningAppProcessInfo> list) {
        BufferedReader bufferedReader;
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
            int i = runningAppProcessInfo.pid;
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/stat"));
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                String[] split = bufferedReader.readLine().split(" ");
                this.uTime += Long.valueOf(split[13]).longValue();
                this.sTime += Long.valueOf(split[14]).longValue();
                this.cuTime += Long.valueOf(split[15]).longValue();
                this.csTime += Long.valueOf(split[16]).longValue();
                this.threadCount += Integer.valueOf(split[19]).intValue();
                this.totalCpuTicks = this.uTime + this.sTime + this.cuTime + this.csTime;
                this.totalTicks = SystemClock.elapsedRealtime() / 10;
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                    Log.d(TAG, "Failed to closee buffered process file reader");
                }
            } catch (Exception unused3) {
                bufferedReader2 = bufferedReader;
                Log.e(TAG, "Failed reading process file for - %d, %s", Integer.valueOf(i), runningAppProcessInfo.processName);
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                        Log.d(TAG, "Failed to closee buffered process file reader");
                    }
                }
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStat
    public MobilyticsResourceStatType getType() {
        return MobilyticsResourceStatType.CPU;
    }

    @Override // com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStat
    public Long getValue() {
        throw new UnsupportedOperationException("method is not supported for CpuStat");
    }

    @Override // com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceStat
    public boolean isValid() {
        return this.totalCpuTicks > 0;
    }

    public CpuStat(long j, long j2, long j3, long j4, int i) {
        this.uTime = j;
        this.sTime = j2;
        this.cuTime = j3;
        this.csTime = j4;
        this.threadCount = i;
        this.totalCpuTicks = j + j2 + j3 + j4;
        this.totalTicks = SystemClock.elapsedRealtime() / 10;
    }
}
