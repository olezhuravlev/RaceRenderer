package RaceRenderer.Common;

public interface CommonVariables {

    ///////////////////////////////////////////////////////////////////////
    // Data Values.

    /**
     * Minimum data value, as set by the user or as measured (if automatic).
     */
    double DataMin = 0;

    /**
     * Set to true if DataMin was the result of automatic measurement, or false if DataMin came from the user.
     */
    boolean DataMinAuto = false;

    /**
     * Maximum data value, as set by the user or as measured (if automatic).
     */
    double DataMax = 0;

    /**
     * Set to true if DataMax was the result of automatic measurement, or false if DataMax came from the user.
     */
    boolean DataMaxAuto = false;

    /**
     * Equal to DataMax-DataMin.
     */
    double DataRange = 0;

    /**
     * Trigger activation level set by the user (when enabled; controls IsTriggered).
     */
    int DataTrigger = 0;

    /**
     * Like DataFactor, but for the DataTrigger value (when enabled).
     */
    int DataTriggerFactor = 0;


    ///////////////////////////////////////////////////////////////////////
    // Drawing Canvas Values

    /**
     * Rendering canvas width.
     */
    double SizeX = 0;

    /**
     * Rendering canvas height.
     */
    double SizeY = 0;

    /**
     * Horizontal center coordinate in canvas.
     */
    double CenterX = 0;

    /**
     * Vertical center coordinate in canvas.
     */
    double CenterY = 0;


    ///////////////////////////////////////////////////////////////////////
    // User Parameter Values

    /**
     * 1st user-controlled color value(when enabled).
     */
    Color ColorA = null;

    /**
     * 2nd user-controlled color value(when enabled).
     */
    Color ColorB = null;

    /**
     * 3rd user-controlled color value(when enabled).
     */
    Color ColorC = null;

    /**
     * 4th user-controlled color value(when enabled).
     */
    Color ColorD = null;

    /**
     * 5th user-controlled color value(when enabled).
     */
    Color ColorE = null;

    /**
     * 6th user-controlled color value(when enabled).
     */
    Color ColorF = null;

    /**
     * 7th user-controlled color value(when enabled).
     */
    Color ColorG = null;

    /**
     * 8th user-controlled color value(when enabled).
     */
    Color ColorH = null;


    ///////////////////////////////////////////////////////////////////////
    // String Values

    /**
     * Current project's preferred speed unit ("MPH", "km/h", "knots", "m/s").
     */
    String SpeedUnit = null;

    /**
     * Current input's name/label.
     */
    String InputName = null;

    /**
     * Location name, based on the input's starting coordinates (if available).<br/>
     * Note: The functionality of this may change in the future!
     */
    String LocName = null;


    ///////////////////////////////////////////////////////////////////////
    // General Constants

    /**
     * Draws a solid shape when specified as the Thickness parameter for Circles,Rectangles, and Polygons.
     */
    boolean Filled = false;


    ///////////////////////////////////////////////////////////////////////
    // Colors:
    enum Color {WHITE, GRAY, BLACK, RED, GREEN, BLUE, YELLOW, ORANGE, BROWN, CYAN, MAGENTA}

    /**
     * Special case used for SetTextOutline().
     */
    boolean Transparent = false;

    /**
     * The same as Transparent.
     */
    boolean Invisible = false;

    /**
     * Horizontal text alignment: (for use with DrawNumber(), DrawTime(), DrawChar(), and DrawText()).
     */
    enum Alignment {AlignH_Left, AlignH_Center, AlignH_Right}


    ///////////////////////////////////////////////////////////////////////
    // DATA FIELD TYPES (for use with GetDataValue()).

    /**
     * X Position(Longitude if GPS coordinates).
     */
    double DFT_PosX = 0;

    /**
     * Y Position(Latitude if GPS coordinates).
     */
    double DFT_PosY = 0;

    /**
     * Z Position(Altitude, in meters).
     */
    double DFT_PosZ = 0;

    /**
     * Speed(unit depends on user setting).
     */
    double DFT_Speed = 0;

    /**
     * Heading(0.0-359.9degrees).
     */
    double DFT_Heading = 0;

    /**
     * X Acceleration(G's).
     */
    double DFT_GForceX = 0;

    /**
     * Y Acceleration(G's).
     */
    double DFT_GForceY = 0;

    /**
     * Throttle Position(typically 0-100%;depends on input data file).
     */
    double DFT_Throttle = 0;

    /**
     * Brake Switch or Position(depends on input data file).
     */
    double DFT_Brake = 0;

    /**
     * Engine RPM.
     */
    double DFT_RPM = 0;

    /**
     * Transmission Gear number.
     */
    int DFT_Gear = 0;

    /**
     * Air/Fuel Ratio or Lambda(depends on input data file).
     */
    double DFT_AirFuel = 0;

    /**
     * Engine Power Output(typically HP or kW; depends on input data file).
     */
    double DFT_Power = 0;

    /**
     * Engine Torque Output(typically ft-lbs or Nm; depends on input data file).
     */
    double DFT_Torque = 0;
}
