/*------------------------------------------------------------------------------
 **     Ident: Sogeti Smart Mobile Solutions
 **    Author: rene
 ** Copyright: (c) 2015 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced
 ** Distributed Software Engineering |  or transmitted in any form or by any
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the
 ** 4131 NJ Vianen                   |  purpose, without the express written
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 *
 *   This file is part of OpenGPSTracker.
 *
 *   OpenGPSTracker is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   OpenGPSTracker is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with OpenGPSTracker.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package nl.sogeti.android.gpstracker.service.util;

/**
 * Created by rene on 15-11-15.
 */
public class ExternalConstants {
    /**
     * Broadcast intent action indicating that the logger service state has changed. Includes the logging state and
     * its precision.
     */
    public static final String LOGGING_STATE_CHANGED_ACTION = "nl.sogeti.android.gpstracker.LOGGING_STATE_CHANGED";
    /**
     * Broadcast intent action indicating that the logger has a location to transmit
     */
    public static final String STREAM_BROADCAST = "nl.sogeti.android.gpstracker.intent.action.STREAMBROADCAST";
    /**
     * Action for the activity that can provide the name to a track.
     */
    public static final String NAMING_ACTION = "nl.sogeti.android.gpstracker.service.action.NAMING";
    /**
     * The state the service is.
     *
     * @see #STATE_UNKNOWN
     * @see #STATE_LOGGING
     * @see #STATE_PAUSED
     * @see #STATE_STOPPED
     */
    public static final String EXTRA_LOGGING_STATE = "nl.sogeti.android.gpstracker.EXTRA_LOGGING_STATE";

    /**
     * The state of the service is unknown
     */
    public static final int STATE_UNKNOWN = -1;

    /**
     * The service is actively logging, it has requested location update from the location provider.
     */
    public static final int STATE_LOGGING = 1;

    /**
     * The service is not active, but can be resumed to become active and store location changes as part of a new
     * segment of the current track.
     */
    public static final int STATE_PAUSED = 2;

    /**
     * The service is not active and can not resume a current track but must start a new one when becoming active.
     */
    public static final int STATE_STOPPED = 3;
    /**
     * The precision of the GPS provider is based on the custom time interval and distance.
     */
    public static final int LOGGING_CUSTOM = 0;
    /**
     * The GPS location provider is asked to update every 10 seconds or every 5 meters.
     */
    public static final int LOGGING_FINE = 1;
    /**
     * The GPS location provider is asked to update every 15 seconds or every 10 meters.
     */
    public static final int LOGGING_NORMAL = 2;
    /**
     * The GPS location provider is asked to update every 30 seconds or every 25 meters.
     */
    public static final int LOGGING_COARSE = 3;
    /**
     * The radio location provider is asked to update every 5 minutes or every 500 meters.
     */
    public static final int LOGGING_GLOBAL = 4;
    /**
     * A distance in meters
     */
    public static final String EXTRA_DISTANCE = "nl.sogeti.android.gpstracker.EXTRA_DISTANCE";
    /**
     * A time period in minutes
     */
    public static final String EXTRA_TIME = "nl.sogeti.android.gpstracker.EXTRA_TIME";
    /**
     * The location that pushed beyond the set minimum time or distance
     */
    public static final String EXTRA_LOCATION = "nl.sogeti.android.gpstracker.EXTRA_LOCATION";
    /**
     * The track that is being logged
     */
    public static final String EXTRA_TRACK = "nl.sogeti.android.gpstracker.EXTRA_TRACK";
    /**
     * The precision the service is logging on.
     */
    public static final String EXTRA_LOGGING_PRECISION = "nl.sogeti.android.gpstracker.EXTRA_LOGGING_PRECISION";

}
