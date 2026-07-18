package Chief_event_coordinator.Classes;

import java.util.HashSet;
import java.util.Set;

public class BadgeVerificationSystem {
    private final Set<String> authorizedBadgeIds = new HashSet<>();

    public void authorizeBadge(String badgeId) {
        validateBadgeId(badgeId);
        authorizedBadgeIds.add(badgeId);
    }

    public void revokeBadge(String badgeId) {
        validateBadgeId(badgeId);
        authorizedBadgeIds.remove(badgeId);
    }

    public boolean verifyBadge(String badgeId) {
        validateBadgeId(badgeId);
        return authorizedBadgeIds.contains(badgeId);
    }

    private void validateBadgeId(String badgeId) {
        if (badgeId == null || badgeId.trim().isEmpty()) {
            throw new IllegalArgumentException("Badge id is required.");
        }
    }
}
