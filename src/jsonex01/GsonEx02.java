package jsonex01;

import com.google.gson.Gson;

class SmsDto {
    private String groupId;
    private int successCount;
    private int errorCount;

    public SmsDto(String groupId, int successCount, int errorCount) {
        this.groupId = groupId;
        this.successCount = successCount;
        this.errorCount = errorCount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

}

public class GsonEx02 {
    public static void main(String[] args) {
        String smsReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
        SmsDto smsDto = new SmsDto("R2GdEONszq64lNB9", 1, 0);
        Gson gson = new Gson();
        String jsonSmsDto = gson.toJson(smsDto);
        System.out.println(jsonSmsDto);

        SmsDto javaSmsDto = gson.fromJson(jsonSmsDto, SmsDto.class);
        System.out.println(smsDto.getGroupId());
        System.out.println(smsDto.getSuccessCount());
        System.out.println(smsDto.getErrorCount());
    }
}
