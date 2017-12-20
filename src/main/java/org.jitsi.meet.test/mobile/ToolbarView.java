/*
 * Copyright @ Atlassian Pty Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jitsi.meet.test.mobile;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;

import org.jitsi.meet.test.mobile.base.*;

import org.openqa.selenium.*;

/**
 * Page object for the mobile toolbar area.
 */
public class ToolbarView extends AbstractMobilePage
{
    /**
     * A locator for the hangup button.
     */
    @AndroidFindBy(accessibility = "Hangup")
    @iOSFindBy(accessibility = "Hangup")
    private MobileElement hangup;

    /**
     * Creates new <tt>ToolbarView</tt>.
     *
     * @param participant <tt>MobileParticipant</tt> instance.
     */
    public ToolbarView(MobileParticipant participant)
    {
        super(participant);
    }

    /**
     * The hangup button.
     *
     * @return <tt>MobileElement</tt> proxy object.
     */
    public MobileElement getHangupButton()
    {
        return hangup;
    }
}
