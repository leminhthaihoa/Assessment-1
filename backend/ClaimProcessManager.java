package backend;

public interface ClaimProcessManager {
    public void addClaim(Claim claim);
    public void updateClaim(Claim claim, int ind);

    public void deleteClaim(int ind);

    public void getOne(int ind);

    public void getAll();
}
