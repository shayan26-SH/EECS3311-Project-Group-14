package Chief_event_coordinator.Classes;

public class IdBadgeScanner {
    private final int roomid;
    private String lastScannedBadgeId;
    private boolean lastBadgeVerified;

    public IdBadgeScanner(int roomid) {
        this.roomid = roomid;
    }

    public boolean scanBadge(String badgeId, BadgeVerificationSystem verificationSystem) {
        if (badgeId == null || badgeId.trim().isEmpty()) {
            throw new IllegalArgumentException("Badge id is required.");
        }
        if (verificationSystem == null) {
            throw new IllegalArgumentException("Badge verification system is required.");
        }

        lastScannedBadgeId = badgeId;
        lastBadgeVerified = verificationSystem.verifyBadge(badgeId);
        return lastBadgeVerified;
    }

    public int getRoomid() {
        return roomid;
    }

    public String getLastScannedBadgeId() {
        return lastScannedBadgeId;
    }

    public boolean wasLastBadgeVerified() {
        return lastBadgeVerified;
    }
}
