package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Statistics;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class StatisticsJsonMarshaller {
    private static StatisticsJsonMarshaller instance;

    public static StatisticsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StatisticsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Statistics statistics, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (statistics.getCount() != null) {
            Integer count = statistics.getCount();
            awsJsonWriter.name("count");
            awsJsonWriter.value(count);
        }
        if (statistics.getAverage() != null) {
            Double average = statistics.getAverage();
            awsJsonWriter.name("average");
            awsJsonWriter.value(average);
        }
        if (statistics.getSum() != null) {
            Double sum = statistics.getSum();
            awsJsonWriter.name("sum");
            awsJsonWriter.value(sum);
        }
        if (statistics.getMinimum() != null) {
            Double minimum = statistics.getMinimum();
            awsJsonWriter.name("minimum");
            awsJsonWriter.value(minimum);
        }
        if (statistics.getMaximum() != null) {
            Double maximum = statistics.getMaximum();
            awsJsonWriter.name("maximum");
            awsJsonWriter.value(maximum);
        }
        if (statistics.getSumOfSquares() != null) {
            Double sumOfSquares = statistics.getSumOfSquares();
            awsJsonWriter.name("sumOfSquares");
            awsJsonWriter.value(sumOfSquares);
        }
        if (statistics.getVariance() != null) {
            Double variance = statistics.getVariance();
            awsJsonWriter.name("variance");
            awsJsonWriter.value(variance);
        }
        if (statistics.getStdDeviation() != null) {
            Double stdDeviation = statistics.getStdDeviation();
            awsJsonWriter.name("stdDeviation");
            awsJsonWriter.value(stdDeviation);
        }
        awsJsonWriter.endObject();
    }
}
