# Horizontal-Recyclerview

Learn how to create a custom horizontal recyclerview with images and text in Android studio.

I will show how to create a horizontal list view of images bind with text which is scrollable along the x-axis in Android Studio as shown below. Also, display a toast message on item click.  

If you are a newbie to RecyclerView class, I will partially highlight some of the advantages of it to a listview. RecyclerView is an advancement of listView. listView does not directly support the horizontal listing of elements, unlike RecyclerView for which you can easily implement both vertical and horizontal listing of items on your android app.

Contain the vertical adapter class and the list of images and text added to the vertical recycler view as shown below.

```
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        mHorizontalRecyclerView = (RecyclerView) findViewById(R.id.horizontalRecyclerView);
        setSupportActionBar(toolbar);


        horizontalAdapter = new HorizontalRecyclerViewAdapter(fillWithData(), getApplication());

        horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        mHorizontalRecyclerView.setLayoutManager(horizontalLayoutManager);
        mHorizontalRecyclerView.setAdapter(horizontalAdapter);
    }

    public ArrayList<ImageModel> fillWithData() {
        ArrayList<ImageModel> imageModelArrayList = new ArrayList<>();
        ImageModel imageModel0 = new ImageModel();
        imageModel0.setId(System.currentTimeMillis());
        imageModel0.setImageName("Battle");
        imageModel0.setImagePath(R.drawable.battle);
        imageModelArrayList.add(imageModel0);

        return imageModelArrayList;
    }
    
``````
<a href="url"><img src="https://github.com/sambhaji213/Horizontal-Recyclerview/blob/master/screenshot/device.png" align="left" height="480" width="250"></a>
