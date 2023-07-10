package inputOutput;

import com.google.gson.annotations.Expose;

public class ExportMeasurement {
    @Expose
    public String toolName;
    @Expose
    public double x_shifted;
    @Expose
    public double y_shifted;
    @Expose
    public double z_shifted;
    @Expose
    public double x_raw;
    @Expose
    public double y_raw;
    @Expose
    public double z_raw;

    public ExportMeasurement(String toolName, double x_raw, double y_raw, double z_raw, double x_shifted, double y_shifted, double z_shifted) {
        this.toolName = toolName;
        this.x_raw = x_raw;
        this.y_raw = y_raw;
        this.z_raw = z_raw;

        this.x_shifted = x_shifted;
        this.y_shifted = y_shifted;
        this.z_shifted = z_shifted;
    }
}