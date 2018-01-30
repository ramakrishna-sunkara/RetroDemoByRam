
package retrodemo.ram.com.retrodemobyram.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserModel {

    @SerializedName("user_id_pk")
    @Expose
    private String userIdPk;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("social_name")
    @Expose
    private String socialName;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("email_id")
    @Expose
    private String emailId;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("age")
    @Expose
    private Object age;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("mobile_no")
    @Expose
    private Object mobileNo;
    @SerializedName("mini_bio")
    @Expose
    private String miniBio;
    @SerializedName("profile_pic")
    @Expose
    private String profilePic;
    @SerializedName("user_role")
    @Expose
    private String userRole;
    @SerializedName("social_id")
    @Expose
    private Object socialId;
    @SerializedName("deviceType")
    @Expose
    private String deviceType;
    @SerializedName("deviceId")
    @Expose
    private Object deviceId;
    @SerializedName("created_date")
    @Expose
    private String createdDate;
    @SerializedName("updated_date")
    @Expose
    private Object updatedDate;
    @SerializedName("login_date")
    @Expose
    private String loginDate;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("verifi_email")
    @Expose
    private String verifiEmail;
    @SerializedName("verifi_mobile")
    @Expose
    private String verifiMobile;
    @SerializedName("payment_expiry_date")
    @Expose
    private Object paymentExpiryDate;
    @SerializedName("payment_subscription_amount")
    @Expose
    private String paymentSubscriptionAmount;
    @SerializedName("ride_share_agreement")
    @Expose
    private String rideShareAgreement;
    @SerializedName("regi_type")
    @Expose
    private String regiType;
    @SerializedName("reset_token")
    @Expose
    private Object resetToken;
    @SerializedName("payment_start_date")
    @Expose
    private String paymentStartDate;
    @SerializedName("transaction_id")
    @Expose
    private Object transactionId;
    @SerializedName("facebook_friends")
    @Expose
    private Object facebookFriends;
    @SerializedName("mobile_edited_no")
    @Expose
    private String mobileEditedNo;

    public String getUserIdPk() {
        return userIdPk;
    }

    public void setUserIdPk(String userIdPk) {
        this.userIdPk = userIdPk;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Object mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMiniBio() {
        return miniBio;
    }

    public void setMiniBio(String miniBio) {
        this.miniBio = miniBio;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Object getSocialId() {
        return socialId;
    }

    public void setSocialId(Object socialId) {
        this.socialId = socialId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Object getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Object deviceId) {
        this.deviceId = deviceId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Object getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Object updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVerifiEmail() {
        return verifiEmail;
    }

    public void setVerifiEmail(String verifiEmail) {
        this.verifiEmail = verifiEmail;
    }

    public String getVerifiMobile() {
        return verifiMobile;
    }

    public void setVerifiMobile(String verifiMobile) {
        this.verifiMobile = verifiMobile;
    }

    public Object getPaymentExpiryDate() {
        return paymentExpiryDate;
    }

    public void setPaymentExpiryDate(Object paymentExpiryDate) {
        this.paymentExpiryDate = paymentExpiryDate;
    }

    public String getPaymentSubscriptionAmount() {
        return paymentSubscriptionAmount;
    }

    public void setPaymentSubscriptionAmount(String paymentSubscriptionAmount) {
        this.paymentSubscriptionAmount = paymentSubscriptionAmount;
    }

    public String getRideShareAgreement() {
        return rideShareAgreement;
    }

    public void setRideShareAgreement(String rideShareAgreement) {
        this.rideShareAgreement = rideShareAgreement;
    }

    public String getRegiType() {
        return regiType;
    }

    public void setRegiType(String regiType) {
        this.regiType = regiType;
    }

    public Object getResetToken() {
        return resetToken;
    }

    public void setResetToken(Object resetToken) {
        this.resetToken = resetToken;
    }

    public String getPaymentStartDate() {
        return paymentStartDate;
    }

    public void setPaymentStartDate(String paymentStartDate) {
        this.paymentStartDate = paymentStartDate;
    }

    public Object getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Object transactionId) {
        this.transactionId = transactionId;
    }

    public Object getFacebookFriends() {
        return facebookFriends;
    }

    public void setFacebookFriends(Object facebookFriends) {
        this.facebookFriends = facebookFriends;
    }

    public String getMobileEditedNo() {
        return mobileEditedNo;
    }

    public void setMobileEditedNo(String mobileEditedNo) {
        this.mobileEditedNo = mobileEditedNo;
    }

}
