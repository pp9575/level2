package Level2.dz4;

@GetMetaData
public class UserMeta {

    @GetMetaData
    private String name;
    @GetMetaData
    private Integer count;


    public UserMeta(String name, Integer count) {
        this.name = name;
        this.count = count;
    }
    @GetMetaData
    public void GetSuperName(String prefix) throws InterruptedException {
            Thread.sleep(10);
    }
}
