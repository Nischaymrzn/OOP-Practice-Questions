// 5. Design and implement a Java program that simulates a network monitoring system. Your system should be capable of monitoring different types of network devices, 
//such as routers and switches, and alerting if any devices are experiencing errors or downtime. Use interfaces to define common behaviors for network devices and 
//implement these behaviors in different device classes.
// Create an interface named Network Device with at least two methods:
// getStatus() which returns a String indicating the current status of the device isAvailable() which returns a boolean indicating if the device is currently available and 
//functioning correctly. Implement the Network Device interface in at least three separate classes, Router and Switch. 
//Each class should have a constructor that sets specific properties for the device and specific logic to determine its status and availability.

public class Task5 {
    public static void main(String[] args) {
        // Create network devices
        Router router1 = new Router("Router1", true, true);
        Router router2 = new Router("Router2", true, false);
        Switch switch1 = new Switch("Switch1", true, true);
        Switch switch2 = new Switch("Switch2", false, false);

        // Display status of network devices
        displayDeviceStatus(router1);
        displayDeviceStatus(router2);
        displayDeviceStatus(switch1);
        displayDeviceStatus(switch2);
    }

    public static void displayDeviceStatus(NetworkDevice device) {
        System.out.println(device.getStatus());
        System.out.println("Device is available: " + device.isAvailable());
        System.out.println();
    }
}


interface NetworkDevice {
    String getStatus();
    boolean isAvailable();
}
class Router implements NetworkDevice {
    private String name;
    private boolean isConnected;
    private boolean isFunctioning;

    public Router(String name, boolean isConnected, boolean isFunctioning) {
        this.name = name;
        this.isConnected = isConnected;
        this.isFunctioning = isFunctioning;
    }

    @Override
    public String getStatus() {
        if (isConnected && isFunctioning) {
            return "Router " + name + " is connected and functioning.";
        } else if (isConnected) {
            return "Router " + name + " is connected but not functioning correctly.";
        } else {
            return "Router " + name + " is disconnected.";
        }
    }

    @Override
    public boolean isAvailable() {
        return isConnected && isFunctioning;
    }
}
class Switch implements NetworkDevice {
    private String name;
    private boolean isConnected;
    private boolean isFunctioning;

    public Switch(String name, boolean isConnected, boolean isFunctioning) {
        this.name = name;
        this.isConnected = isConnected;
        this.isFunctioning = isFunctioning;
    }

    @Override
    public String getStatus() {
        if (isConnected && isFunctioning) {
            return "Switch " + name + " is connected and functioning.";
        } else if (isConnected) {
            return "Switch " + name + " is connected but not functioning correctly.";
        } else {
            return "Switch " + name + " is disconnected.";
        }
    }

    @Override
    public boolean isAvailable() {
        return isConnected && isFunctioning;
    }
}
