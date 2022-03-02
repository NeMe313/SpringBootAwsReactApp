package com.zvezdan.awsimageupload.datastore;

import com.zvezdan.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("a0fb64b9-7ff9-4a76-9088-9a07e3024aa2"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("81a91ddb-0042-47c4-99b3-a11daeda751c"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
