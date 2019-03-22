package com.example.lenovopc.thapareats.Remote;

import com.example.lenovopc.thapareats.Model.DataMessage;
import com.example.lenovopc.thapareats.Model.MyResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAYtGJ-W8:APA91bEujGzGWyYTtF355XC9KKjwhZJS20T9COX-vNR2QcuOeLQSK9oUkJ0Ru1Ebqi5SpKGobk-fR3fpbvcYLfvvi3vxF0QRPUuqetB7LE2zAiX1Yy3eutXU9AChS3m4_tJ8Wjy3xgiJ"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body DataMessage body);
}
