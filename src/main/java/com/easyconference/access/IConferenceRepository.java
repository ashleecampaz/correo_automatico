package com.easyconference.access;

import com.easyconference.domain.entities.Conference;
import java.util.List;

public interface IConferenceRepository {
    public boolean storeConference(Conference objConference);
    public List<Conference> listConference();
}
