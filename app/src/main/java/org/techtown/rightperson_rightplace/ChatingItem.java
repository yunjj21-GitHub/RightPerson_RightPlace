package org.techtown.rightperson_rightplace;

public class ChatingItem {
    private int profileImage;
    private String nickname;
    private String preChating;

    public ChatingItem(int profileImage, String nickname, String preChating) {
        this.profileImage = profileImage;
        this.nickname = nickname;
        this.preChating = preChating;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPreChating() {
        return preChating;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPreChat(String preChating) {
        this.preChating = preChating;
    }
}
