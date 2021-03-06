/*
 * � Copyright IBM Corp. 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package com.ibm.sbt.test.java.connections;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ibm.sbt.automation.core.environment.TestEnvironment;
import com.ibm.sbt.test.java.connections.activitystreams.ActionableView;
import com.ibm.sbt.test.java.connections.activitystreams.AllUpdates;
import com.ibm.sbt.test.java.connections.activitystreams.CommunitiesIFollow;
import com.ibm.sbt.test.java.connections.activitystreams.GetStreamEntities;
import com.ibm.sbt.test.java.connections.activitystreams.MyNetworkUpdates;
import com.ibm.sbt.test.java.connections.activitystreams.NotificationsForMe;
import com.ibm.sbt.test.java.connections.activitystreams.NotificationsFromMe;
import com.ibm.sbt.test.java.connections.activitystreams.PeopleIFollow;
import com.ibm.sbt.test.java.connections.activitystreams.PostEvent;
import com.ibm.sbt.test.java.connections.activitystreams.PostEventUsingPopulator;
import com.ibm.sbt.test.java.connections.activitystreams.PostEventWithEmbeddedExperience;
import com.ibm.sbt.test.java.connections.activitystreams.PostStatusUpdate;
import com.ibm.sbt.test.java.connections.activitystreams.ResponseToMyContent;
import com.ibm.sbt.test.java.connections.activitystreams.SavedView;
import com.ibm.sbt.test.java.connections.activitystreams.Search;
import com.ibm.sbt.test.java.connections.activitystreams.SearchByTag;
import com.ibm.sbt.test.java.connections.activitystreams.UpdatesFromSpecificCommunity;
import com.ibm.sbt.test.java.connections.activitystreams.UpdatesFromUser;

/**
 * @author mwallace
 * 
 * @date 6 Mar 2013
 */
@RunWith(Suite.class)
@SuiteClasses({ ActionableView.class, AllUpdates.class, CommunitiesIFollow.class, GetStreamEntities.class,MyNetworkUpdates.class, NotificationsForMe.class, NotificationsFromMe.class, 
	PeopleIFollow.class, PostEvent.class, PostEventUsingPopulator.class, PostEventWithEmbeddedExperience.class, PostStatusUpdate.class, ResponseToMyContent.class, SavedView.class, Search.class,
        SearchByTag.class, UpdatesFromSpecificCommunity.class, UpdatesFromUser.class }) 
public class ActivityStreamsTestSuite {
    @AfterClass
    public static void cleanup() {
        TestEnvironment.cleanup();
    }
}
