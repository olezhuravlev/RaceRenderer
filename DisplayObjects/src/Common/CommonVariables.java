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
    String ColorF = null;

    /**
     * 7th user-controlled color value(when enabled).
     */
    String ColorG = null;

    /**
     * 8th user-controlled color value(when enabled).
     */
    String ColorH = null;


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


    ///////////////////////////////////////////////////////////////////////
    // TEXT FUNCTIONS.

    /**
     * Sets the outline color used for for DrawNumber(), DrawTime(), DrawChar(), and DrawText().     Call SetTextOutline(Transparent) to disable it.
     */
    default void SetTextOutline(Color color) {
    }

    /**
     * Draws Value as a number at X, Y.
     */
    default void DrawNumber(double Value, int Decimals, double X, double Y, Color color, double Size, Alignment alignment) {
    }

    default void DrawNumber(double Value, int Decimals, double X, double Y, Color color, double Size, int alignment) {
    }

    /**
     * Draws Value (number of seconds) as a formatted time at X, Y.<br/>
     * Compact 0 = Always Show Hours, 1 = Minutes, 2 = Seconds.
     */
    default void DrawTime(int Value, int Decimals, double X, double Y, Color color, double Size, Alignment alignment, int Compact) {
    }

    /**
     * Draws a character at X, Y. Note: single character only, not a string.
     */
    default void DrawChar(char CharValue, double X, double Y, Color color, double Size, Alignment alignment) {
    }

    /**
     * Draws a text string at X, Y.
     */
    default void DrawText(String str, double X, double Y, Color color, double Size, Alignment alignment) {
    }


    ///////////////////////////////////////////////////////////////////////
    // FUNCTIONS FOR LINES & SHAPES

    /**
     * Draws a dot at X, Y.
     */
    default void DrawDot(double X, double Y, Color color, double Size) {
    }

    /**
     * Draws a dot at X, Y with gradient coloring.
     */
    default void DrawDotGradient(double X, double Y, Color ColorA, Color ColorB, double Size) {
    }

    /**
     * Draws a dot at X, Y with gradient coloring (RGB blending for brighter colors).
     */
    default void DrawDotGradientRGB(double X, double Y, Color ColorA, Color ColorB, double Size) {
    }

    /**
     * Draws a filled square at X, Y.
     */
    default void DrawSquare(double X, double Y, Color color, double Size) {
    }

    /**
     * Draws a line from X1, Y1 to X2, Y2.
     */
    default void DrawLine(double X1, double Y1, double X2, double Y2, Color color, double Thickness) {
    }

    /**
     * Draws a line from X1, Y1 to X2, Y2.
     */
    default void DrawLine(double X1, double Y1, double X2, double Y2, Color color, boolean Filled) {
    }

    /**
     * Draws a line from X1, Y1 to X2, Y2, with gradient coloring.
     */
    default void DrawLineGradient(double X1, double Y1, double X2, double Y2, Color ColorA, Color ColorB, double Thickness) {
    }

    /**
     * Draws a line from X1, Y1 to X2, Y2, with gradient coloring.
     */
    default void DrawLineGradient(double X1, double Y1, double X2, double Y2, Color ColorA, Color ColorB, boolean Filled) {
    }

    /**
     * Draws a line from X1, Y1 to X2, Y2, with gradient coloring (RGB blending for brighter colors).
     */
    default void DrawLineGradientRGB(double X1, double Y1, double X2, double Y2, Color ColorA, Color ColorB, double Thickness) {
    }

    /**
     * Draws a line from X1, Y1 to X2, Y2, with gradient coloring (RGB blending for brighter colors).
     */
    default void DrawLineGradientRGB(double X1, double Y1, double X2, double Y2, Color ColorA, Color ColorB, boolean Filled) {
    }

    /**
     * Draws a line from X1, Y1 to X2, Y2, with flat ends.
     */
    default void DrawLineFlat(double X1, double Y1, double X2, double Y2, Color color, double Thickness) {
    }

    /**
     * Draws a line from X1, Y1 to X2, Y2, with flat ends.
     */
    default void DrawLineFlat(double X1, double Y1, double X2, double Y2, Color color, boolean Filled) {
    }

    /**
     * Draws a circle with a center at X, Y. Thickness may be set to Filled.
     */
    default void DrawCircle(double X, double Y, double Radius, Color color, double Thickness) {
    }

    /**
     * Draws a circle with a center at X, Y. Filled may be set to Thickness.
     */
    default void DrawCircle(double X, double Y, double Radius, Color color, boolean Filled) {
    }

    /**
     * Draws a quadratic Bezier curve from X1,Y1 to X2,Y2 based on specified control point, with optional thickness tapering and gradient-coloring.
     * ProgressLimit should be between 0.0 and 1.0; Use 1.0 to draw the entire curve.
     */
    default void DrawCurve(double X1, double Y1, double ControlX, double ControlY, double X2, double Y2, double ProgressLimit, Color ColorA, Color ColorB, double ThicknessA, double ThicknessB) {
    }

    /**
     * ?????
     */
    default void DrawCurve(double X1, double Y1, double ControlX, double ControlY, double X2, double Y2, double ProgressLimit, Color ColorA, Color ColorB, boolean FilledA, double FilledB) {
    }

    /**
     * ?????
     */
    default void DrawCurve(double X1, double Y1, double ControlX, double ControlY, double X2, double Y2, double ProgressLimit, Color ColorA, Color ColorB, double FilledA, boolean FilledB) {
    }

    /**
     * ?????
     */
    default void DrawCurve(double X1, double Y1, double ControlX, double ControlY, double X2, double Y2, double ProgressLimit, Color ColorA, Color ColorB, boolean FilledA, boolean FilledB) {
    }

    /**
     * Draws a quadratic Bezier curve from X1,Y1 to X2,Y2 based on specified control point, with optional thickness tapering and gradient-coloring (RGB blending for brighter colors).
     * ProgressLimit should be between 0.0 and 1.0; Use 1.0 to draw the entire curve.
     */
    default void DrawCurveRGB(double X1, double Y1, double ControlX, double ControlY, double X2, double Y2, double ProgressLimit, Color ColorA, Color ColorB, double ThicknessA, double ThicknessB) {
    }

    /**
     * ?????
     */
    default void DrawCurveRGB(double X1, double Y1, double ControlX, double ControlY, double X2, double Y2, double ProgressLimit, Color ColorA, Color ColorB, boolean FilledsA, double FilledB) {
    }

    /**
     * ?????
     */
    default void DrawCurveRGB(double X1, double Y1, double ControlX, double ControlY, double X2, double Y2, double ProgressLimit, Color ColorA, Color ColorB, double FilledsA, boolean FilledB) {
    }

    /**
     * ?????
     */
    default void DrawCurveRGB(double X1, double Y1, double ControlX, double ControlY, double X2, double Y2, double ProgressLimit, Color ColorA, Color ColorB, boolean FilledsA, boolean FilledB) {
    }

    /**
     * Draws a rectangle from X1, Y1 to X2, Y2. Thickness may be set to Filled.
     */
    default void DrawRect(double X1, double Y1, double X2, double Y2, Color color, double Thickness) {
    }

    /**
     * Draws a rectangle from X1, Y1 to X2, Y2. Filled may be set to Thickness.
     */
    default void DrawRect(double X1, double Y1, double X2, double Y2, Color color, boolean Filled) {
    }

    /**
     * Draws a rounded-rectangle from X1, Y1 to X2, Y2. Thickness may be set to Filled.
     */
    default void DrawRRect(double X1, double Y1, double X2, double Y2, Color color, double Thickness) {
    }

    /**
     * Draws a rounded-rectangle from X1, Y1 to X2, Y2. Filled may be set to Thickness.
     */
    default void DrawRRect(double X1, double Y1, double X2, double Y2, Color color, boolean Filled) {
    }

    /**
     * Draws an oval-shaped rectangle from X1, Y1 to X2, Y2. Thickness may be set to Filled.
     */
    default void DrawORect(double X1, double Y1, double X2, double Y2, Color color, double Thickness) {
    }

    /**
     * Draws an oval-shaped rectangle from X1, Y1 to X2, Y2. Filled may be set to Thickness.
     */
    default void DrawORect(double X1, double Y1, double X2, double Y2, Color color, boolean Filled) {
    }

    /**
     * Draws a 3-point polygon from X1, Y1 to X2, Y2 to X3, Y3. Thickness may be set to Filled.
     */
    default void DrawPoly3(double X1, double Y1, double X2, double Y2, double X3, double Y3, Color color, double Thickness) {
    }

    /**
     * Draws a 3-point polygon from X1, Y1 to X2, Y2 to X3, Y3. Filled may be set to Thickness.
     */
    default void DrawPoly3(double X1, double Y1, double X2, double Y2, double X3, double Y3, Color color, boolean Filled) {
    }

    /**
     * Draws a 4-point polygon from X1, Y1 to X2, Y2 to X3, Y3 to X4, Y4. Thickness may be set to Filled.
     */
    default void DrawPoly4(double X1, double Y1, double X2, double Y2, double X3, double Y3, double X4, double Y4, Color color, double Thickness) {
    }

    /**
     * Draws a 4-point polygon from X1, Y1 to X2, Y2 to X3, Y3 to X4, Y4. Filled may be set to Thickness.
     */
    default void DrawPoly4(double X1, double Y1, double X2, double Y2, double X3, double Y3, double X4, double Y4, Color color, boolean Filled) {
    }


    ///////////////////////////////////////////////////////////////////////
    // FUNCTIONS FOR COLOR BLENDING

    /**
     * Returns color blended from Color1 to Color2 by Amount (0.0 to 1.0).
     */
    default void BlendColors(Color Color1, Color Color2, double Amount) {
    }

    /**
     * Returns color RGB-blended from Color1 to Color2 by Amount (0.0 to 1.0).
     * This tends to result in brighter colors than the BlendColors() function.
     */
    default void BlendColorsRGB(Color Color1, Color Color2, double Amount) {
    }


    ///////////////////////////////////////////////////////////////////////
    // GENERAL FUNCTIONS FOR DATA INPUT.

    /**
     * Gets current data field index for the given data channel name (text string). These indexes are dynamic, based on the input data file.
     * Important: This can reduce performance if used in the Foreground script. Instead, use it to set a variable in the Background script, and then use that variable with GetDataValue() in the Foreground script.
     */
    default void GetDataIndex(String DataFieldName) {
    }

    /**
     * Gets current data value for the specified data channel. See DFT_* values for available options, or obtain an index for a specific named channel using GetDataIndex().
     */
    default void GetDataValue(int DataFieldIndex) {
    }


    ///////////////////////////////////////////////////////////////////////
    // FUNCTIONS FOR INPUT LAP NUMBERS AND TIMES.

    /**
     * Gets the completed lap time (in seconds) for the given lap number.
     */
    default void GetLapTime(int LapNum) {
    }

    /**
     * Gets the current lap number.
     */
    default void GetCurLapTime() {
    }

    /**
     * Gets the current running lap time (in seconds).
     */
    default void GetCurLapNum() {
    }

    /**
     * Gets the overall best lap number.
     */
    default void GetBestLapNum() {
    }

    /**
     * Gets the overall best lap time (in seconds).
     */
    default void GetBestLapTime() {
    }

    /**
     * Gets the current best lap number.
     */
    default void GetCurBestLapNum() {
    }

    /**
     * Gets the current best lap time (in seconds).
     */
    default void GetCurBestLapTime() {
    }

    /**
     * Gets the best lap number as of the previous lap.
     */
    default void GetPrevBestLapNum() {
    }

    /**
     * Gets the best lap time (in seconds) as of the previous lap.
     */
    default void GetPrevBestLapTime() {
    }


    ///////////////////////////////////////////////////////////////////////
    // GENERAL FUNCTIONS.

    /**
     * Returns a string from a numeric value, shown to the specified number of decimal places.
     */
    default void FormatNumber(double Value, int Decimals) {
    }

    /**
     * Returns a directional heading string from a numeric heading value(0-360 degrees).
     */
    default void FormatHeading(double Value) {
    }

    /**
     * Returns the number of characters in a string.
     */
    default void strlen(String str) {
    }

    /**
     * Returns a substring from within a string, based on StartPos(index of first character;starts at zero) and Length (number of characters).
     * Returns a blank string if StartPos is invalid.Returns all characters after StartPos if Length is <0 or larger than input string length.
     */
    default void substr(String str, int StartPos, int Length) {
    }

    /**
     * Converts a string to uppercase.
     */
    default void ToUpper(String str) {
    }

    /**
     * Converts a string to lowercase.
     */
    default void ToLower(String str) {
    }

    /**
     * Trims whitespace off of the start and end of a string.
     */
    default void trim(String str) {
    }

    /**
     * Converts an ASCII character code value into a text character.
     */
    default void chr(char Value) {
    }

    /**
     * Converts a text character into its an ASCII character code value.
     */
    default void asc(char Character) {
    }

    /**
     * Alternates between true and false(1 and 0 integers) based on Interval(seconds) useful for making things flash.
     */
    default void Strobe(int Interval) {
    }

    /**
     * Writes one or more parameter values(numeric or string) to the Output Messages log.
     */
    default void Print(double[] Value) {
    }

    /**
     * Writes one or more parameter values(numeric or string) to the Output Messages log.
     */
    default void Print(String[] Value) {
    }


    ///////////////////////////////////////////////////////////////////////
    // MATH FUNCTIONS.

    /**
     * Absolute:  Removes negative sign,if applicable(-1.5becomes 1.5, 1.7remains 1.7).
     */
    default double abs(double Value) {
        return 0;
    }


    /**
     * Ceiling: Rounds Value up to the next higher integer(1.3becomes 2.0, -1.3becomes -1.0).
     */
    default int ceil(double Value) {
        return 0;
    }

    /**
     * Floor: Rounds Value down to the lower integer(1.7becomes 1.0, -1.7becomes -2.0).
     */
    default int Floor(double Value) {
        return 0;
    }

    /**
     * Maximum: Returns the greater of ValueA and ValueB.
     */
    default double max(double ValueA, double ValueB) {
        return 0;
    }

    /**
     * Minimum: Returns the lesser of ValueA and ValueB.
     */
    default double min(double ValueA, double ValueB) {
        return 0;
    }

    /**
     * Power: Raise Base to the specified Exponent.
     */
    default double pow(double Base, int Exponent) {
        return 0;
    }

    /**
     * Round: Rounds Value to number of decimal places; if 0, then the nearest integer(1.6becomes 2.0, 1.4becomes 1.0).
     */
    default double round(double Value, int Decimals) {
        return 0;
    }

    /**
     * Square Root.
     */
    default double sqrt(double Value) {
        return 0;
    }

    /**
     * Truncate: Discards the decimal component of Value to make it an integer(1.7becomes 1.0, -1.7becomes -1.0).
     */
    default double trunc(double Value) {
        return 0;
    }

    /**
     * Sine.
     */
    default double sin(double Degrees) {
        return 0;
    }

    /**
     * Cosine.
     */
    default double cos(double Degrees) {
        return 0;
    }

    /**
     * Tangent.
     */
    default double tan(double Degrees) {
        return 0;
    }

    /**
     * Arc sine of Value, in  degrees.
     */
    default double asin(double Value) {
        return 0;
    }

    /**
     * Arc cosine of Value, in degrees.
     */
    default double acos(double Value) {
        return 0;
    }

    /**
     * Arc tangent of Value, in degrees.
     */
    default double atan(double Value) {
        return 0;
    }

    /**
     * Arc tangent of Y/X, in degrees.
     */
    default double atan2(double X, double Y) {
        return 0;
    }

    /**
     * Hypotenuse of triangle with sides of X and Y length. Square root of(X2 +Y2).
     */
    default double hypot(double X, double Y) {
        return 0;
    }
}
