package RaceRenderer.Common;

public interface ForegroundVariables {

    /**
     * Current sample data value from the input file
     */
    double DataValue = 0;

    /**
     * DataValue expressed in a range from 0.0 to 1.0, based on DataMin and DataMax
     */
    double DataFactor = 0;

    /**
     * Set to 1 if DataValue >= DataTrigger (when enabled)
     */
    boolean IsTriggered = false;

    /**
     * Current time (in seconds) in the input file
     */
    int SampleTime = 0;

    /**
     * Duration/Interval (in seconds) of frame at the current target frame rate
     */
    int FrameInterval = 0;

    /**
     * Current time (in seconds) relative to the start of this display object (resets to zero upon each new timeline segment)
     */
    int DisplayTime = 0;
}
