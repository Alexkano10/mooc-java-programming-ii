

public class Checker {
    
    public boolean isDayOfWeek(String string){
        
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public boolean allVowels (String string){
        return string.matches("[aeiou]+");
    }
    
    public boolean timeOfDay(String string){
        // Primero validamos que tenga el formato correcto
        if (!string.matches("\\d{2}:\\d{2}:\\d{2}")) {
            return false;
        }

        // Luego extraemos hh, mm y ss
        String[] parts = string.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);

        // Verificamos rangos válidos
        return (hours >= 0 && hours <= 23)
                && (minutes >= 0 && minutes <= 59)
                && (seconds >= 0 && seconds <= 59);
    }
    
}
