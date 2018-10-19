package com.hamsutel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiRequest {
    String username,password;
    String senderid,token,message,to;


}
