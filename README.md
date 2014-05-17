IPAM
====
<b>What is IPAM?</b><br/>

  IPAM(IP Address Management) is a tool that helps to manage the combination of ip addresses and physical addresses in real world.

This repo is an ip management tool for GSN.

Wiki Link:
====
[IPAM Wiki](https://wiki.vip.corp.ebay.com/display/IPAM/IPAM)

API Documentation
===


#### Notifications
* Most requests to the api will return a [json](http://www.json.org) object.
* In this version, if the return value is not a json, then it must be the value of "Success" or "Fail". 
* If the result is a json with a "Fail" result, then please get the "reason" from json.

#### Some explanations:
##### &nbsp;&nbsp;Value of ip(part of an ip) :   
&nbsp;&nbsp;&nbsp;&nbsp;a value of an ip or part of an ip is the integer value when the ip is an Integer. The value of 10.0.0.0 is
167772160.


<b><sub>API Table(updating):</sub></b>
===
|Api Name      | Description             |
|--------------|-------------------------|
|[Add IP](https://github.scm.corp.ebay.com/wanhong/IPAM#add-ip)        | Add new ip to database  |
|[Get Root IPs](https://github.scm.corp.ebay.com/wanhong/IPAM/#get-root-ips)  | Get root ipv4 & ipv6    |
|[Get Available IPs](https://github.scm.corp.ebay.com/wanhong/IPAM#get-available-ips) | Get all available ips |
|[Get Free IPv4](https://github.scm.corp.ebay.com/wanhong/IPAM#get-free-ipv4s) | Get all the free ipv4s | 
|[Get Free IPv6](https://github.scm.corp.ebay.com/wanhong/IPAM#get-free-ipv6s) | Get all the free ipv6s |
|[Get Locations](https://github.scm.corp.ebay.com/wanhong/IPAM#get-locations) | Get locations (sub locations) | 
|[Get Bridge Groups](https://github.scm.corp.ebay.com/wanhong/IPAM#get-bridge-groups) | Get Bridge Groups |
|[Get Bridge Group ID](https://github.scm.corp.ebay.com/wanhong/IPAM#get-bridge-group-id) | Get Bridge Group ID |
|[Get IP by ID](https://github.scm.corp.ebay.com/wanhong/IPAM#get-ip-by-id) | Get IP Info by ID |
|[Get IP ID](https://github.scm.corp.ebay.com/wanhong/IPAM#get-ip-id) | Get IP ID |
|[Get IP](https://github.scm.corp.ebay.com/wanhong/IPAM#get-ip) | Get IP |
|[Get Location Bridge Groups](https://github.scm.corp.ebay.com/wanhong/IPAM#get-location-bridge-groups) | Get Location Bridge Group |
|[Get Location By IP ID] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-location-by-ip-id) | Get Location By IP Id |
|[Get Location By Name] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-location-by-name) | Get Location By Name |
|[Get Location IP] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-location-ip) | Get All location IP |
|[Get location IP Plans] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-location-ip-plan) | Get Location IP Plans |
|[Get Location IP Plan Available Sub IPs] (https://github.scm.corp.ebay.com/wanhong/IPAM/#get-location-ip-plan-available-sub-ips) | Get All Location IP Plan Available Sub IPs |
|[Get Location VLans] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-location-vlan) | Get All Location VLans |
|[Get Location Switches] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-location-switch) | Get All Location Switches |
|[Get Locked IPs] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-locked-ips) | Get All Locked IPs |
|[Get Location P2P Links] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-location-p2ps) | Get All Location P2Ps |
|[Get IP Subnet by IP ID] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-subnet-by-ip-id) | Get IP Subnet by IP ID |
|[Get Switch ID] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-switch-id) | Get Switch ID via Name |
|[Get VLan Hosts] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-vlan-hosts) | Get VLan hosts via type and id |
|[Get VLan ID] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-vlan-id) | Get VLan IP via it's vlan num and bridge group name |
|[Get VLan Info By ID] (https://github.scm.corp.ebay.com/wanhong/IPAM#get-vlan-info-by-id) | Get All VLan Info by ID |
|[Add IP to IP Plan] (https://github.scm.corp.ebay.com/wanhong/IPAM#add-all-ip-to-plan) | Add All IP in a Location to its Plan |
|[Add Bridge Group to Location] (https://github.scm.corp.ebay.com/wanhong/IPAM#add-bridge-group-to-location) | Add a new Bridge Group to a Location |
|[Add Empty VLan] (https://github.scm.corp.ebay.com/wanhong/IPAM#add-empty-vlan) | Add a VLan without IP address |
|[Add Host to VLan] (https://github.scm.corp.ebay.com/wanhong/IPAM#add-host-to-vlan) | Add a VLan Host |
|[Add IP Plan] (https://github.scm.corp.ebay.com/wanhong/IPAM#add-ip-plan) | Add an IP Plan |
|[Add Location] (https://github.scm.corp.ebay.com/wanhong/IPAM#add-location) | Add a Location |
|[Change Bridge Group State] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-bridge-group-state) | Change Bridge Group State |
|[Change Host Name] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-host-name) | Change Host Name |
|[Change Host Description] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-host-description) | Change Host Description |
|[Change IP State] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-ip-state) | Change IP State |
|[Change IP Note] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-ip-note) | Change IP Note |
|[Change IP Plan State] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-ip-plan-state) | Change IP Plan State |
|[Change IP Plan Note] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-ip-plan-note) | Change IP Plan Note |
|[Change Location Parent] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-location-parent) | Change Location Parent |
|[Change Location Name] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-location-name) | Change Location Name |
|[Change P2P Downlink IP] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-p2p-downlink-ip) | Change P2P Downlink IP |
|[Change P2P Uplink IP] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-p2p-uplink-ip) | Change P2P Uplink IP |
|[Change P2P State] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-p2p-state) | Change P2P State |
|[Chnage Switch State] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-switch-state) |  Change Switch State|
|[Change VLan Name] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-vlan-name) | Change VLan Name |
|[Change VLan Note] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-vlan-note) | Change VLan Note |
|[Change VLan Root Switch] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-vlan-root-switch) | Change VLan Root Swtich |
|[Change VLan State] (https://github.scm.corp.ebay.com/wanhong/IPAM#change-vlan-state) | Change VLan State |
|[Delete Bridge Group] (https://github.scm.corp.ebay.com/wanhong/IPAM#delete-bridge-group) | Delete Bridge Group |
|[Delete P2P] (https://github.scm.corp.ebay.com/wanhong/IPAM#delete-p2p) | Delete P2P |
|[Delete Switch] (https://github.scm.corp.ebay.com/wanhong/IPAM#delete-switch) | Delete Switch |
|[Delete VLan] (https://github.scm.corp.ebay.com/wanhong/IPAM#delete-vlan) | Delete VLan |
|[Is Bridge Group Name Unique] (https://github.scm.corp.ebay.com/wanhong/IPAM#is-bridge-group-name-unique) |Is Bridge Group Name Unique　|
|[Is Host Used] (https://github.scm.corp.ebay.com/wanhong/IPAM#is-host-used) | Is Host Used |
|[Is Location Name Unique] (https://github.scm.corp.ebay.com/wanhong/IPAM#is-location-name-unique) | Is Location Name Unique |
|[Is Switch Port Used] (https://github.scm.corp.ebay.com/wanhong/IPAM#is-switch-port-used) | Is Switch Port Used |
|[Is Switch Name Unique] (https://github.scm.corp.ebay.com/wanhong/IPAM#is-switch-name-unique) | Is Switch Name Unique |
|[Is VLan Name Unique] (https://github.scm.corp.ebay.com/wanhong/IPAM#is-vlan-name-unique) | Is VLan Name Unique |
|[Is VLan Num Unique] (https://github.scm.corp.ebay.com/wanhong/IPAM#is-vlan-num-unique) | Is VLan Num Unique |
|[Remove IP From Location] (https://github.scm.corp.ebay.com/wanhong/IPAM#remove-ip-from-location) | Remove IP From Location |
|[Remove Location IP Plan] (https://github.scm.corp.ebay.com/wanhong/IPAM#remove-location-ip-plan) | Remove Location IP Plan |
|[Remove Location] (https://github.scm.corp.ebay.com/wanhong/IPAM#remove-location) | Remove Location |
|[Remove VLan Host] (https://github.scm.corp.ebay.com/wanhong/IPAM#remove-vlan-host) | Remove VLan Host |





### <strong>Add ip</strong>

> #### Description:
> &nbsp;&nbsp;<b>This is the api which can add a new ip to the IPAM Database.</b>
> #### Url:
> &nbsp;&nbsp;<b>api/add-ip.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>ipv4</em> - int : [value of a 32 bits ipv4](https://github.scm.corp.ebay.com/wanhong/IPAM#value-of-ippart-of-an-ip-)</b>  
> &nbsp;&nbsp;<b><em>ipv6_1</em> - int : value of the first 32 bits of a ipv6</b>  
> &nbsp;&nbsp;<b><em>ipv6_2</em> - int : value of the second 32 bits of a ipv6</b>  
> &nbsp;&nbsp;<b><em>ipv6_3</em> - int : value of the third 32 bits of a ipv6</b>  
> &nbsp;&nbsp;<b><em>ipv6_4</em> - int : value of the fourth 32 bits of a ipv6</b>  
> &nbsp;&nbsp;<b><em>ipv4_addr</em> - String : address of ipv4 </b>  
> &nbsp;&nbsp;<b><em>ipv6_addr</em> - String : address of ipv6 </b>  
> &nbsp;&nbsp;<b><em>mask</em> - int : mask of your ip address </b>  
> &nbsp;&nbsp;<b><em>status</em> - String : status of your ip address </b>  
> &nbsp;&nbsp;<b><em>note</em> - String : notes of your ip address </b>  
> &nbsp;&nbsp;<b><em>type</em> - int : type of your ip address </b>  
> &nbsp;&nbsp;<b><em>is_root</em> - boolean : this parameter indicates whether this is a root ip which can be divided</b>
> #### Return value (json):
> &nbsp;&nbsp;<b><em>result</em> : returns "Success" if the action succeeded, "Fail" if the action failed.</b>  
> #### Example:
> ##### <em>JavaScript</em>
    var ipv4 = 167772160;
    var ipv4_addr = "10.0.0.0";
    var ipv6_1 = 0;
    var ipv6_2 = 0;
    var ipv6_3 = 0;
    var ipv6_4 = 0;
    var ipv6_addr = '';
    var mask = 8;
    var status = 'free';    
    var note = '';
    var type = 0;
    var is_root = true;  
    $.post("../api/add-ip.pl", {ipv4: ipv4, ipv6_1: ipv6_1, ipv6_2: ipv6_2, ipv6_3: ipv6_3,
        ipv6_4: ipv6_4, ipv4_addr: ipv4_addr, ipv6_addr: ipv6_addr, mask: mask, status: status,
        note: note, type: type, is_root:is_root}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
> #### Notifications:
> * You can only add an ipv4 address or ipv6 address at one time.
> * If you're adding an ipv4 address, please set the type parameter to 0, else set it to 1
> * Status of the ip can only be one of the <em>free</em>, <em>allocated</em>, <em>divided</em>

### <strong>Get Root ips</strong>

> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get all the root ips.</b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-all-ip-roots.pl</b>
> #### Parameters:
> 
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'ipv4_roots' => array, 'ipv6_roots' => array}</b><br/>
> &nbsp;&nbsp; Each one of ipv4_roots array is in the following format: 
> 
    {
     'id':int, id of the root ipv4,
     'ip':int, value of the ipv4 address,
     'ip_addr':String, ipv4 address in String as 10.0.0.0,
     'mask':int, mask value of the ipv4 address,
     'status':String, the status of the root ipv4, maybe 'free', 'allocated', 'divided',
     'type':int(0), this is a flag to indicate that this is a ipv4 address
    }
> &nbsp;&nbsp; Each one of ipv6_roots array is in the following format: 
>
    {
      'id':int, id of the root ipv6,
      'ipv6_1':int, first 32 bits value of the ipv6 address,
      'ipv6_2':int, second 32 bits value of the ipv6 address,
      'ipv6_3':int, third 32 bits value of the ipv6 address,
      'ipv6_4':int, last 32 bits value of the ipv6 address,
      'ipv6_addr':String, ipv6 address in String as 10:0:0:0:0:0:0:0,
      'mask':int, mask value of the ipv6 address,
      'type':int(1), this is a flag to indicate that this is a ipv6 address
    }
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-all-ip-roots.pl", function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
      {
        "ipv4_roots":[
          {
            "ip":"0167772160",
            "id":"4749",
            "type":"",
            "status":"free",
            "mask":"8",
            "ip_addr":"10.0.0.0"
          }
        ],
        "ipv6_roots":[
          {
            "note":"",
            "ipv6_2":"0000000000",
            "ipv6_3":"0000000000",
            "ipv6_1":"0001048576",
            "ipv6_addr":"10:0000:0000:0000:0000:0000:0000:0000",
            "mask":"16",
            "type":"1",
            "id":"1434",
            "ipv6_4":"0000000000"
          }
        ]
      }
      
### <strong>Get available ips</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get all the available ips. Avaiable ips are the ips whose state is 'free'.</b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-available-ips.pl</b>
> #### Parameters:
> 
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'ipv4_roots' => array, 'ipv6_roots' => array}</b><br/>
> &nbsp;&nbsp; Each one of ipv4_roots array is in the following format: 
> 
    {
     'id':int, id of the root ipv4,     
     'ipv4_addr':String, ipv4 address in String as 10.0.0.0,
     'mask':int, mask value of the ipv4 address,          
    }
> &nbsp;&nbsp; Each one of ipv6_roots array is in the following format: 
>
    {
      'id':int, id of the root ipv6,    
      'ipv6_addr':String, ipv6 address in String as 10:0:0:0:0:0:0:0,
      'mask':int, mask value of the ipv6 address,      
    }
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-available-ips.pl", function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
      {
        "result": "Success",
        "ipv6s":[
          {
            "ipv6_addr":"10:0000:0000:0000:0000:0000:0000:0000",
            "mask":"16",
            "id":"1434"
          }
        ],
        "ipv4s":[
          {
            "id":"4749",
            "mask":"8",
            "ipv4_addr":"10.0.0.0"
          }
        ]
      }
      
### <strong>Get free ipv4s</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get all the available ipv4s. Avaiable ipv4s are the ips whose state is 'free'.</b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-ipv4.pl</b>
> #### Parameters:
> 
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'ipv4s' => array}</b><br/>
> &nbsp;&nbsp; Each one of ipv4s array is in the following format: 
> 
    {
     'id':int, id of the root ipv4,     
     'ip':String, ipv4 address with mask in String as 10.0.0.0/8,       
    }
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-ipv4.pl", function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
     {
      "result":"Success",
      "ipv4s":[
        {
          "id":"4749",
          "ip":"10.0.0.0/8"
        }
      ]
    }
    
### <strong>Get free ipv6s</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get all the available ipv6s. Avaiable ipv6s are the ips whose state is 'free'.</b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-ipv4.pl</b>
> #### Parameters:
> 
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'ipv6s' => array}</b><br/>
> &nbsp;&nbsp; Each one of ipv6s array is in the following format: 
> 
    {
     'id':int, id of the root ipv4,     
     'ip':String, ipv6 address with mask in String as 10:0:0:0:0:0:0:0/16,       
    }
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-ipv4.pl", function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
      {
        "ipv6s":[
          {
            "id":"1434",
            "ip":"10:0000:0000:0000:0000:0000:0000:0000/16"
          }
        ],
        "result":"Success"
      }

### <strong>Get locations</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get the locations(sub locations) info. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-ipv4.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>parent_id</em> - int: please not set this parameter if you want to get all the root locations. Elase set it, then the api will get all the direct sub locations of your location.</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'locations' => array}</b><br/>
> &nbsp;&nbsp; Each one of locations array is in the following format: 
> 
    {
     'id':int, id of the root ipv4,     
     'name':String, name of the location,
     'note':String, note of the location,
     'has_children': boolean, true if this is a parent location,
     'parent':int, id of parent location of this location, this value will be null if this is a root location
    }
> #### Example:
> ##### <em>JavaScript</em>
> ##### Without Parent Id
    $.post("../api/get-locations.pl", function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
      {
        "locations":[
        {
          "note":"",
          "parent":null,
          "name":"A",
          "id":"525",
          "has_children":0
        },
        {
          "name":"B",
          "has_children":0,
          "id":"526",
          "parent":null,
          "note":""
        }
      ],
      "result":"Success"
    }
>
> ##### With Parent Id
    $.post("../api/get-locations.pl", {parent_id: 526}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
      {
        "locations":[
        {
          "note":"",
          "parent":526,
          "name":"B1",
          "id":"527",
          "has_children":0
        },
      ],
      "result":"Success"
    }    
    
  
### <strong>Get locations</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get the locations(sub locations) info. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-ipv4.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>parent_id</em> - int: please not set this parameter if you want to get all the root locations. Elase set it, then the api will get all the direct sub locations of your location.</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'locations' => array}</b><br/>
> &nbsp;&nbsp; Each one of locations array is in the following format: 
> 
    {
     'id':int, id of the root ipv4,     
     'name':String, name of the location,
     'note':String, note of the location,
     'has_children': boolean, true if this is a parent location,
     'parent':int, id of parent location of this location, this value will be null if this is a root location
    }
> #### Example:
> ##### <em>JavaScript</em>
> ##### Without Parent Id
    $.post("../api/get-locations.pl", function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
      {
        "locations":[
        {
          "note":"",
          "parent":null,
          "name":"A",
          "id":"525",
          "has_children":0
        },
        {
          "name":"B",
          "has_children":0,
          "id":"526",
          "parent":null,
          "note":""
        }
      ],
      "result":"Success"
    }
>
> ##### With Parent Id
    $.post("../api/get-locations.pl", {parent_id: 526}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
      {
        "locations":[
        {
          "note":"",
          "parent":526,
          "name":"B1",
          "id":"527",
          "has_children":0
        },
      ],
      "result":"Success"
    }    
    

### <strong>Get Bridge Groups</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get all the bridge gruop info. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-bridge-groups.pl</b>
> #### Parameters:
>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'bridge_groups' => array}</b><br/>
> &nbsp;&nbsp; Each one of bridge groups array is in the following format: 
> 
    {
     'id':int, id of the root ipv4,     
     'name':String, name of the location,
     'location_id':int, id of location of this bridge group.
    }
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-bridge-groups.pl", function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
      {
        "bridge_gruops":[
        {
          "name":"BG:ash0",
          "id":"525",
          "location_id": "1"
        },
        {
          "name":"BG:ash1",
          "id":"526",
          "location_id": "2"
        }
      ],
      "result":"Success"
    }
>

### <strong>Get Bridge Group ID</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get a bridge group via name and location. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-bridge-group-id.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>location_name</em> - String: the location name of which this bridge group belongs to</b>  
> &nbsp;&nbsp;<b><em>bridge_group_name</em> - String: the name of bridge group</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'bridge_group_id' => int}</b><br/>

> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-bridge-group-id.pl", {location_name: "ash0", bridge_group_name: "BG:ash0"}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "bridge_group_id": "1"
    }
>

### <strong>Get IP by ID</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get IP info via it's id. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-ip-by-id.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: the ID of which IP you want to get</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'ip' => Object}</b><br/>
> &nbsp;&nbsp;The IP Object should in the following format: 
> If it's an IPv4
>
    {
     'id':int, id of the ip,     
     'ip':int, int value of the ip,
     'ip_addr':String, IP address of the IP,
     'mask':int, mask length of the IP,
     'status':String, status(locked, free, divided, allocated) of the IP,
     'state':String, state(unprovision, preprovisioned, production) of the IP
    }
> If it's an IPv6
>
    {
     'id':int, id of the ip,     
     'ipv6_1':int, first 32 bits int value of the ip,
     'ipv6_2':int, second 32 bits int value of the ip,
     'ipv6_3':int, third 32 bits int value of the ip,
     'ipv6_4':int, fourth 32 bits int value of the ip,
     'ipv6_addr':String, IP address of the IP,
     'mask':int, mask length of the IP,
     'status':String, status(locked, free, divided, allocated) of the IP,
     'state':String, state(unprovision, preprovisioned, production) of the IP
    }    
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-ip-by-id.pl", {id: 1026}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "ip": 
      {
        "id": "1026",
        "ip": "1048576",
        "ip_addr": "10.0.0.0",
        "mask": "8",
        "status": "allocated",
        "note": "none",
        "state": "production"
      }
    }
>

### <strong>Get IP ID</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get an IP ID via ip_address and mask. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-ip-id.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>ip_address</em> - String: the ip address of which id you want to get</b>  
> &nbsp;&nbsp;<b><em>mask</em> - String: the mask length of which id you want to get</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'id' => int}</b><br/>

> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-bridge-group-id.pl", {ip_address: "10.0.0.0", mask: "8"}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "id": "1"
    }
>
> #### Notifications:
> * If the return id equals -1, then the IP does not exist

### <strong>Get IP</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get an IP Info via mask length and IP value. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-ip.pl</b>
> #### Parameters:
> IPv4 Version:
> &nbsp;&nbsp;&nbsp;&nbsp;<b><em>ipv4</em> - int: the IP value of the IP</b>  
> &nbsp;&nbsp;&nbsp;&nbsp;<b><em>mask</em> - int: the mask length of the IP</b>  
> &nbsp;&nbsp;&nbsp;&nbsp;<b><em>type</em> - int(0): whether this is an IPv4 or IPv6 request, 0 is IPv4, 1 is IPv6</b>  
> IPv6 Version:
> &nbsp;&nbsp;&nbsp;&nbsp;<b><em>ipv6_1</em> - int: the first 32 bits IP value of the IP</b>  
> &nbsp;&nbsp;&nbsp;&nbsp;<b><em>ipv6_2</em> - int: the second 32 bits IP value of the IP</b>  
> &nbsp;&nbsp;&nbsp;&nbsp;<b><em>ipv6_3</em> - int: the third 32 bits IP value of the IP</b>  
> &nbsp;&nbsp;&nbsp;&nbsp;<b><em>ipv6_4</em> - int: the fourth 32 bits IP value of the IP</b>  
> &nbsp;&nbsp;&nbsp;&nbsp;<b><em>mask</em> - int: the mask length of the IP</b>  
> &nbsp;&nbsp;&nbsp;&nbsp;<b><em>type</em> - int(1): whether this is an IPv4 or IPv6 request, 0 is IPv4, 1 is IPv6</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'ips' => array}</b><br/>
> &nbsp;&nbsp; Each one of bridge groups array is in the following format: 
> IPv4
> 
    {
     'id':int, id of the IP,     
     'ip':int, int value of the IP,
     'ip_addr':String, IP address of the IP,
     "mask":int, mask length of the IP,
     "status": status of the IP,
     "note": note of the IP
    }
>    
> IPv6
> 
    {
     'id':int, id of the IP,     
     'ipv6_1':int, first 32 bits int value of the IP,
     'ipv6_2':int, second 32 bits int value of the IP,
     'ipv6_3':int, third 32 bits int value of the IP,
     'ipv6_4':int, fourth 32 bits int value of the IP,
     'ipv6_addr':String, IP address of the IP,
     "mask":int, mask length of the IP,
     "status": status of the IP,
     "note": note of the IP
    }    
> #### Example:
> ##### <em>JavaScript</em>
> ##### IPv4:
>
    $.post("../api/get-ip.pl", {type: "0", mask: "8", ipv4: "1048576"}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "ips": 
      [
        {
          "id": "1026",
          "ip": "1048576",
          "ip_addr": "10.0.0.0",
          "mask": "8",
          "status": "allocated",
          "note": "none",
        }
      ]
    }
>
> ##### IPv6:
>
    $.post("../api/get-ip.pl", {type: "1", mask: "32", ipv6_1: "1048576", ipv6_2: "0", ipv6_3: "0", ipv6_4: "0"}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "ips": 
      [
        {
          "id": "1026",
          "ipv6_1": "1048576",
          "ipv6_2": "0",
          "ipv6_3": "0",
          "ipv6_4": "0",
          "ip_addr": "10:0:0:0:0:0:0:0",
          "mask": "32",
          "status": "allocated",
          "note": "none",
        }
      ]
    }
>


### <strong>Get Location Bridge Groups</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get all bridge groups of a location. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-location-bridge-group.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of which location's bridge group you want</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'bridge_groups' => array}</b><br/>
> &nbsp;&nbsp; Each one of bridge groups array is in the following format: 
> 
    {
     'id':int, id of the IP,     
     'name':String, name of the bridge group,
     'location_id':int, id of the location it belongs to,
     'state':String, state of the bridge group
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-location-bridge-group.pl", {'id': 1}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "bridge_groups":
      [
        {
          "name": "BG:ash0",
          "id": "2",
          "location_id": "1",
          "state": "production"
        },
        {
          "name": "BG:ash1",
          "id": "3",
          "location_id": "1",
          "state": "production"
        }
      ]
    }
>


### <strong>Get Location By IP ID</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get the location of a IP by its ID. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-location-by-ip.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of IP</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'id' => int(String), 'name'=> String, 'parent' => int, 'note' => String}</b><br/>

> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-location-by-ip.pl", {'id': 1}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "id": "10",
      "name": "ams1",
      "parent": "9",
      "note": "none"
    }
>
> #### Notifications:
> * If the return id is "not existed" or name is "Not used", then the IP doesn't have any binding location

### <strong>Get Location By Name</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get the location by its name. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-location-by-name.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>name</em> - String: name of the location</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'location' => Object}</b><br/>
> &nbsp;&nbsp; The location object is in the following format: 
> 
    {
     'id':int, id of the location,     
     'name':String, name of the location,
     'note': String, note of the location,
     'has_children':int, this indicate whether the location has a sublocation, 0 is not, 1 is has,
     'parent':int, parent id of the location
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-location-by-name.pl", {'name': 'ash0'}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "location":
      {
        "id": "1",
        "name": "ash0",
        "note": "",
        "has_children", "0",
        "parent", "-1"
      }
    }
>
> #### Notifications:
> * If the result is 'Fail' then this location doesn't exist, if the parent_id is -1, then this is a root location which doesn't have parent node.

### <strong>Get Location IP</strong>    
#### Description:
> &nbsp;&nbsp;<b>This is the api which can get all the location's IP address. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-location-ip.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of the location</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'ipv4s' => arry, 'ipv6s' => array}</b><br/>
> &nbsp;&nbsp; The ipv4s object is in the following format: 
> 
    {
     'id':int, id of the location,     
     'ip':int, int value of the ipv4,
     'ip_addr':String, the ip address of ipv4,
     'mask':int, mask of the ip,
     'note':String,
     'status':String,
     'state':String
    }
> 
> &nbsp;&nbsp; The ipv6s object is in the following format: 
> 
    {
     'id':int, id of the location,     
     'ipv6_1':int, int value of the first 32 bits of ipv6,
     'ipv6_2':int, int value of the second 32 bits of ipv6,
     'ipv6_3':int, int value of the third 32 bits of ipv6,
     'ipv6_4':int, int value of the fourth 32 bits of ipv6,
     'ipv6_addr':String, the ip address of ipv6,
     'mask':int, mask of the ip,
     'note':String,
     'status':String,
     'state':String
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-location-ip.pl", {'location_id': '1'}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "ipv4s":
      [
        {
          "id": "1",
          "ip": "1048576",
          "ip_addr": "10.0.0.0",
          "mask": "8",
          "note": "",
          "status": "allocated",
          "state": "production"
        }
      ],
      "ipv6s":
      [
        {
          "id": "2",
          "ipv6_1": "1048576",
          "ipv6_2": "0",
          "ipv6_3": "0",
          "ipv6_4": "0",
          "ip_addr": "10:0:0:0:0:0:0:0",
          "mask": "16",
          "note": "",
          "status": "allocated",
          "state": "production"
        }
      ]
    }
>

### <strong>Get Location IP Plan</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get the location's IP Plans by its id. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-location-ip-plans.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of the location</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'ip_plans' => array}</b><br/>
> &nbsp;&nbsp; The IP Plan object is in the following format: 
> 
    {
     'id':int, id of the location,     
     'ipv4_addr':String, ipv4 address of the plan,
     'ipv6_addr':String, ipv6 address of the plan,
     'ipv4_mask':int, ipv4 mask of the plan,
     'ipv6_mask':int, ipv6 mask of the plan,
     'note':String,
     'state':String
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-location-ip-plans.pl", {'location_id': '1'}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "ip_plans":
      [
        {
          'id':'1',
          'ipv4_addr': '10.0.0.0',
          'ipv6_addr': '10:0:0:0:0:0:0:0',
          'ipv4_mask': '8',
          'ipv6_mask': '16',
          'note': 'ip plan for ash0',
          'state': 'production'
        }
      ]
    }
>


### <strong>Get Location IP Plan Available Sub IPs</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get the location's available subnets according to the IP Plan. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-location-ip-plan-subip.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of the location</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'ipv4s' => array, 'ipv6s' => array}</b><br/>
> &nbsp;&nbsp; The IPv4s Object is in following format
> 
    {
     'id':int, id of the ip,     
     'ipv4_addr':String, ipv4 address of the ip,
    }
> 
> &nbsp;&nbsp; The IPv6s Object is in following format
> 
    {
     'id':int, id of the ip,     
     'ipv6_addr':String, ipv6 address of the ip,
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-location-ip-plan-subip.pl", {'location_id': '1'}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "ipv4s":
      [
        {
          'id':'1',
          'ipv4_addr': '10.0.0.0/8',
        }
      ],
      "ipv6s":
      [
        {
          'id':'1',
          'ipv6_addr': '10:0:0:0:0:0:0:0/16',
        }
      ]
    }
>



### <strong>Get Location Switch</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get the location's switches. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-location-switch.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of the location</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'switches' => array}</b><br/>
> &nbsp;&nbsp; The Switches Object is in following format
> 
    {
     'id':int, id of the switch,     
     'name':String, name of the switch,
     'ipv4':String, ipv4 address of the switch,
     'ipv6':String, ipv6 address of the switch,
     'bridge_group_name': bridge group name of the switch,
     'state':String
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-location-switch.pl", {'location_id': '1'}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      'switches':
      [
        {
          'id': '1',
          'name': 'ash0-wc01',
          'ipv4': '10.192.0.1/32',
          'ipv6': '',
          'bridge_group_name': 'BG:ash0',
          'state': 'production'
        }
      ]
    }
>


### <strong>Get Location VLan</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get the location's vLans. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-location-vlan.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of the location</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'vlans' => array}</b><br/>
> &nbsp;&nbsp; The VLans Object is in following format
> 
    {
     'id':int, id of the vlan,
     'num':int, vlan id of the vlan,
     'ipv4':String, ipv4 address of the vlan,
     'ipv6':String, ipv6 address of the vlan,
     'bridge_group_name':String, bridge group name of the vlan,
     'state':String,
     'name':String, vlan name,
     'note':String,
     'root':String, root_swtich of the vlan
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-location-vlan.pl", {'location_id': '1'}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      'vlans':
      [
        {
          'id': '1',
          'name': 'USER WIFI',
          'num': '101',
          'ipv4': '10.64.0.0/24',
          'ipv6': '',
          'bridge_group_name': 'BG:ash0',
          'state': 'production',
          'note':'',
          'root': 'ash0-wr01'
        }
      ]
    }
>
> #### Notifications:
> * If the  VLan has no root switch or root switch information is empty in IPAM then root will be 'none'.


### <strong>Get Locked IPs</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get all the IP that are in the locked status. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-locked-ip.pl</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'ips' => array}</b><br/>
> &nbsp;&nbsp; The ips Object is in the following format
> 
    {
     'id':int, id of the ip,
     'status':String,
     'ip': ip address of the locked ip(either v4 or v6)
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-locked-ip.pl", function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      'ips':
      [
        {
          'id': '1',
          'status': 'locked',
          'ip': '10.0.0.0/8'
        }
      ]
    }
>


### <strong>Get Location P2Ps</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get the location's p2p links. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-p2p.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of the location</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'p2p_links' => array}</b><br/>
> &nbsp;&nbsp; The p2p_links Object is in following format
> 
    {
     'id':int, id of the p2p,
     'ipv4':String, ipv4 address of the p2p,
     'ipv6':String, ipv6 address of the p2p,
     'state':String,
     'parent_switch':String, up link switch name with port,
     'child_switch':String down link switch name with port,
     'parent_ip':String, up link ip address, 
     'child_ip':String, down link ip address,
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-p2p.pl", {'location_id': '1'}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      'p2p_links':
      [
        {
           'id': '1',
           'ipv4': '10.0.0.0/30',
           'ipv6': '',
           'state': 'production',
           'parent_switch': 'ash0-wr01:g0/0',
           'child_switch': 'ash0-lr01:g0/0',
           'parent_ip': '10.0.0.1/32'
           'child_ip': '10.0.0.2/32'
        }
      ]
    }
>


### <strong>Get Subnet By IP ID</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get all subnets of an IP that is in the Database.</b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-subnet-by-id.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of which IP's subnet you want to get</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'ips' => array}</b><br/>
> &nbsp;&nbsp; The ips Object is in following format
>
> IPv4
> 
    {
     'id':int, id of the location,     
     'ip':int, int value of the ipv4,
     'ip_addr':String, the ip address of ipv4,
     'mask':int, mask of the ip,
     'note':String,
     'status':String,
    }
> 
> IPv6
> 
    {
     'id':int, id of the location,     
     'ipv6_1':int, int value of the first 32 bits of ipv6,
     'ipv6_2':int, int value of the second 32 bits of ipv6,
     'ipv6_3':int, int value of the third 32 bits of ipv6,
     'ipv6_4':int, int value of the fourth 32 bits of ipv6,
     'ipv6_addr':String, the ip address of ipv6,
     'mask':int, mask of the ip,
     'note':String,
     'status':String,
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-subnet-by-id.pl", {'id': '1'}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      'ips':
      [
        {
          "id": "1",
          "ip": "1048576",
          "ip_addr": "10.0.0.0",
          "mask": "8",
          "note": "",
          "status": "allocated",
        }
      ]
    }
>

### <strong>Get Switch ID</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get the switch's id. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-switch-id.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>switch_name</em> - String: name of the switch</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'id' => int}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-switch-id.pl", {'switch_name': 'ash0-wr01'}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      'id': '1'
    }
>

### <strong>Get VLan Hosts</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get all the hosts of a vlan. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-vlan-hosts.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>vlan_id</em> - int: id of the vlan</b>  
> &nbsp;&nbsp;<b><em>type</em> - int: indicate ipv4(0) or ipv6(1) </b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'hosts' => array}</b><br/>
> &nbsp;&nbsp; The hosts Object is in following format
> 
    {
     'id':int, id of the p2p,
     'ip_address':String, ip address of the host,
     'host_name':String, name of the host,
     'description':String, 
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-vlan-hosts.pl", {'vlan_id': 1, type: 0}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "hosts":
      [
        {
          "id": "1",
          "ip_address": "10.0.0.1",
          "host_name": "HSRP",
          "description: ""
        }
      ]
    }
>

### <strong>Get VLan ID</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can get the vlan's id. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-vlan-id.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>bridge_group_id</em> - int: id of the bridge group the vlan belongs to</b>  
> &nbsp;&nbsp;<b><em>vlan_num</em> - int: vlan num of the vlan</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'id' => int}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-vlan-id.pl", {'vlan_num': '101', 'bridge_group_name': "BG:ash0"}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      'id': '1'
    }
>


### <strong>Get VLan Info By Id</strong>    
#### Description:
> &nbsp;&nbsp;<b>This is the api which can get all the vLan related information via ID.</b>
> #### Url:
> &nbsp;&nbsp;<b>api/get-vlan-info-by-id.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the vlan</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'ipv4s' => arry, 'ipv6s' => array}</b><br/>
> &nbsp;&nbsp; The ipv4s object is in the following format: 
> 
    {
     'id':int, id of the location,     
     'ip':int, int value of the ipv4,
     'ip_addr':String, the ip address of ipv4,
     'mask':int, mask of the ip,
     'note':String,
     'status':String,
     'vlan_id':int, vlan id of the vlan it belongs to
    }
> 
> &nbsp;&nbsp; The ipv6s object is in the following format: 
> 
    {
     'id':int, id of the location,     
     'ipv6_1':int, int value of the first 32 bits of ipv6,
     'ipv6_2':int, int value of the second 32 bits of ipv6,
     'ipv6_3':int, int value of the third 32 bits of ipv6,
     'ipv6_4':int, int value of the fourth 32 bits of ipv6,
     'ipv6_addr':String, the ip address of ipv6,
     'mask':int, mask of the ip,
     'note':String,
     'status':String,
     'vlan_id':int, vlan id of the vlan it belongs to
    }
> 
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/get-vlan-info-by-id.pl", {'id': '1'}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "ipv4s":
      [
        {
          "id": "1",
          "ip": "1048576",
          "ip_addr": "10.0.0.0",
          "mask": "24",
          "note": "",
          "status": "allocated",
          "vlan_id": "1"
        }
      ],
      "ipv6s":
      [
        {
          "id": "2",
          "ipv6_1": "1048576",
          "ipv6_2": "0",
          "ipv6_3": "0",
          "ipv6_4": "0",
          "ip_addr": "10:0:0:0:0:0:0:0",
          "mask": "32",
          "note": "",
          "status": "allocated",
          "vlan_id": "1"
        }
      ]
    }
>

### <strong>Add All IP to Plan</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can add all ip allocation to ip plan in a location. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/add-all-ip-to-plan.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of the location you want to change</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/add-all-ip-to-plan.pl", {"location_id": "1"}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
    }
>


### <strong>Add Bridge Group to Location</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can add a new bridge group to a location. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/add-bridge-group.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of the location you want to change</b>  
> &nbsp;&nbsp;<b><em>name</em> - String: name of the new bridge group</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/add-bridge-group.pl", {"location_id": "1", "name": "BG:ash0-1"}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
    }
>


### <strong>Add Empty VLan</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can add an empty vLan to a bridge group. Empty VLan is a vLan has no ip address. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/add-empty-vlan.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>num</em> - int: vLan id</b>  
> &nbsp;&nbsp;<b><em>name</em> - String: name of the vLan</b>
> &nbsp;&nbsp;<b><em>bridge_group_id</em> - int: id of the bridge group the vLan belongs to</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'vlan_id' => int}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/add-empty-vlan.pl", {"bridge_group_id": "1", "name": "ash0 non routable", "num": 501}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "vlan_id": "1"
    }
>

### <strong>Add Host to VLan</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can add a host to a specific vLan. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/add-host-to-vlan.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>ip_address</em> - String: IP address of the host id</b>  
> &nbsp;&nbsp;<b><em>vlan_id</em> - int: vLan id of which the host belongs to</b>  
> &nbsp;&nbsp;<b><em>host_name</em> - String: name of the host</b>
> &nbsp;&nbsp;<b><em>description</em> - String: description of the host</b>
> &nbsp;&nbsp;<b><em>type</em> - int: identify this is an IPv4 host(0) or an IPv6 one(1)</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'host' => Object}</b><br/>
> &nbsp;&nbsp; The host object is in the following format: 
> 
    {
     'id':int, id of the host,     
     'ip_address':String, the ip address of host,
     'host_name':String, name of the host,
     'description':String, description of the host
    }
>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/add-empty-vlan.pl", {"ip_address": "10.0.0.1", "host_name": "HSRC", "vlan_id": "1", "description": "", "type": "0"}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });     
    Output:
    {
      "result":"Success",
      "host:"
      {
        "id": "1",
        "ip_address": "10.0.0.1",
        "host_name": "HSRC",
        "description": ""
      }
    }
>


### <strong>Add IP Plan</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can add an IP plan to a location. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/add-ip-plan.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>ipv4</em> - int: int value of ipv4</b>  
> &nbsp;&nbsp;<b><em>ipv6_1</em> - int: int value of first 32 bits of ipv6</b>  
> &nbsp;&nbsp;<b><em>ipv6_2</em> - int: int value of second 32 bits of ipv6</b>  
> &nbsp;&nbsp;<b><em>ipv6_3</em> - int: int value of third 32 bits of ipv6</b>  
> &nbsp;&nbsp;<b><em>ipv6_4</em> - int: int value of fourth 32 bits of ipv6</b>  
> &nbsp;&nbsp;<b><em>ipv4_mask</em> - int: mask of ipv4</b>  
> &nbsp;&nbsp;<b><em>ipv6_mask</em> - int: mask of ipv6</b>  
> &nbsp;&nbsp;<b><em>ipv4_address</em> - String: ip address of ipv4</b>  
> &nbsp;&nbsp;<b><em>ipv6_address</em> - String: ip address of ipv6</b>  
> &nbsp;&nbsp;<b><em>note</em> - String: note of the ip plan</b>  
> &nbsp;&nbsp;<b><em>location_id</em> - int: location id of which this ip plan belongs to</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    var ipv4 = 167772160;
    var ipv4_addr = "10.0.0.0";
    var ipv6_1 = 0;
    var ipv6_2 = 0;
    var ipv6_3 = 0;
    var ipv6_4 = 0;
    var ipv6_addr = '';
    var ipv4_mask = 8;
    var ipv6_mask = 0;
    var note = '';
    var location_id = 1;
    $.post("../api/add-ip-plan.pl", {ipv4: ipv4, ipv6_1: ipv6_1, ipv6_2: ipv6_2, ipv6_3: ipv6_3,
        ipv6_4: ipv6_4, ipv4_address: ipv4_addr, ipv6_address: ipv6_addr, ipv4_mask: ipv4_mask, ipv6_mask: ipv6_mask,
        note: note, location_id: location_id}, function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
      "host:"
      {
        "id": "1",
        "ip_address": "10.0.0.1",
        "host_name": "HSRC",
        "description": ""
      }
    }
>

### <strong>Add Location</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can add a new location. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/add-simple-location.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>name</em> - String: name of new location</b>  
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of which location the new location belongs to</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/add-location.pl", {name: 'phx1', location_id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>
> #### Notifications:
> * If the new location has no parent location, then please fill the location_id by -1


### <strong>Change Bridge Group State</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change the bridge group state. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-bridge-group-state.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the bridge group</b>  
> &nbsp;&nbsp;<b><em>state</em> - String: state of the bridge group could be (production, preprovisioned, unprovisioned)</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-bridge-group-state.pl", {state: 'provisioned', id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Change Host Description</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a host description. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-host-description.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>des</em> - String: description of host</b>  
> &nbsp;&nbsp;<b><em>id</em> - int: id of the host to be changed</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'id' => int}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-host-description.pl", {des: 'HSRP', id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>

### <strong>Change Host Name</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a host name. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-host-name.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>name</em> - String: name of host</b>  
> &nbsp;&nbsp;<b><em>id</em> - int: id of the host to be changed</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-host-name.pl", {name: 'HSRP', id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Change IP Note</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change an IP's note. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-ip-note.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>note</em> - String: note of IP</b>  
> &nbsp;&nbsp;<b><em>id</em> - int: id of the IP to be changed</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-ip-note.pl", {note: 'HSRP', id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Change IP Plan Note</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change an IP Plan's note. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-ip-plan-note.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>note</em> - String: note of IP Plan</b>  
> &nbsp;&nbsp;<b><em>id</em> - int: id of the IP Plan to be changed</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-ip-plan-note.pl", {note: 'HSRP', id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Change IP Plan State</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change an IP Plan's state. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-ip-plan-state.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>state</em> - String: state of IP Plan which can be "unprovisioned", "preprovisioned" or "production"</b>  
> &nbsp;&nbsp;<b><em>id</em> - int: id of the IP Plan to be changed</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-ip-plan-state.pl", {state: 'production', id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>

### <strong>Change IP State</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change an IP's state. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-ip-state.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>state</em> - String: state of IP which can be "unprovisioned", "preprovisioned" or "production"</b>  
> &nbsp;&nbsp;<b><em>id</em> - int: id of the IP to be changed</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-ip-state.pl", {state: 'production', id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Change Location Name</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a location's name. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-location-name.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>name</em> - String: new name of location.</b>
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of the location to be changed</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-location-name.pl", {name: 'phx1-1', id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>

### <strong>Change Location Parent</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a location's name. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-location-parent.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of location.</b>
> &nbsp;&nbsp;<b><em>new_parent</em> - int: id of the new parnet location.</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-location-parent.pl", {id: '1', new_parent: '2'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>

### <strong>Change P2P Downlink IP</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a P2P Link's downlink IP address. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-p2p-child.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the P2P Link.</b>
> &nbsp;&nbsp;<b><em>ip</em> - String: IP address of the downlink</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-p2p-child.pl", {id: '1', ip: '10.0.0.0/32'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>

### <strong>Change P2P Uplink IP</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a P2P Link's uplink IP address. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-p2p-parent.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the P2P Link.</b>
> &nbsp;&nbsp;<b><em>ip</em> - String: IP address of the uplink</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-p2p-parent.pl", {id: '1', ip: '10.0.0.0/32'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Change P2P State</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a P2P Link's state. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-p2p-state.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the P2P Link.</b>
> &nbsp;&nbsp;<b><em>state</em> - String: state('unprovisioned', 'preprovisioned', 'production') of the P2P Link</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-p2p-state.pl", {id: '1', state: 'production'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>

### <strong>Change Switch State</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a Switch's state. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-switch-state.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the switch.</b>
> &nbsp;&nbsp;<b><em>state</em> - String: state('unprovisioned', 'preprovisioned', 'production') of the switch</b>  
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-switch-state.pl", {id: '1', state: 'production'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Change VLan Name</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a VLan's name. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-vlan-name.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the vLan.</b>
> &nbsp;&nbsp;<b><em>name</em> - String: new name for the VLan
> &nbsp;&nbsp;<b><em>num</em> - int: number of the VLan
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-vlan-name.pl", {name: 'Wifi-Users 2nd floor', 'id': '1', num: '201'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>

### <strong>Change VLan Note</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a VLan's note. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-vlan-note.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the vLan.</b>
> &nbsp;&nbsp;<b><em>note</em> - String: note for the VLan
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-vlan-note.pl", {note: '2nd floor', 'id': '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Change VLan Root Switch</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a VLan's root switch. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-vlan-root.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>vlan_id</em> - int: id of the vLan.</b>
> &nbsp;&nbsp;<b><em>root_id</em> - int: id of the new root switch
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-vlan-root.pl", {vlan_id: '1', 'root_id': '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Change VLan State</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can change a VLan's state. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/change-vlan-state.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the vLan.</b>
> &nbsp;&nbsp;<b><em>state</em> - String: state('unprovisioned', 'preprovisioned', 'production') of the vLan
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/change-vlan-state.pl", {id: '1', 'state': 'production'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Delete Bridge Group</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can delete a bridge group. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/delete-bridge-group.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>bridge_group_id</em> - int: id of the bridge group to be deleted.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/delete-bridge-group.pl", {bridge_group_id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Delete P2P</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can delete a p2p. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/delete-p2p.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>p2p_id</em> - int: id of the p2p to be deleted.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/delete-p2p.pl", {p2p_id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Delete Switch</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can delete a switch. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/delete-switch.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>switch_id</em> - int: id of the switch to be deleted.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/delete-switch.pl", {switch_id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>

### <strong>Delete VLan</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can delete a VLan. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/delete-vlan.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>vlan_id</em> - int: id of the VLan to be deleted.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/delete-vlan.pl", {vlan_id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>

### <strong>Is Bridge Group Name Unique</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which test whether bridge group is unique under a location. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/is-bridge-group-name-unique.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>location_id</em> - int: id of the location the bridge group belongs to.</b>
> &nbsp;&nbsp;<b><em>name</em> - String: name of the bridge group.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'is_unique' => true/false}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/is-bridge-group-name-unique.pl", {location_id: '1', "BG:ash0"},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
      "is_unique": "true"
    }
>

### <strong>Is Host Used</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which test whether a host is alreay existed under a VLan. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/is-host-used.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>host</em> - String: IP address of the host.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'is_used' => true/false}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/is-host-used.pl", {host: '10.0.0.0'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
      "is_used": "false"
    }
>

### <strong>Is Location Name Unique</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which test whether a location name is alreay existed. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/is-location-name-unique.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>name</em> - String: name of the location.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'is_unique' => true/false}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/is-location-name-unique.pl", {name: 'pvg6'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
      "is_unique": "true"
    }
>

### <strong>Is Switch Port Used</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which test whether a switch's port is alreay used. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/is-port-used.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>port</em> - String: port of the switch.</b>
> &nbsp;&nbsp;<b><em>switch_id</em> - int: id of  the switch.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'is_used' => true/false}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/is-port-used.pl", {port: 'g0/0', switch_id: "1"},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
      "is_used": "false"
    }
>

### <strong>Is Switch Name Unique</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which test whether a switch name is alreay existed. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/is-switch-name-unique.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>name</em> - String: name of the switch.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'is_unique' => true/false}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/is-switch-name-unique.pl", {name: 'ash0-wr01'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
      "is_unique": "true"
    }
>

### <strong>Is VLan Name Unique</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which test whether a vLan name is alreay existed. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/is-vLan-name-unique.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>name</em> - String: name of the vLan.</b>
> &nbsp;&nbsp;<b><em>bridge_group_id</em> - int: id of the bridge group the vLan belongs to.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'is_unique' => true/false}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/is-vlan-name-unique.pl", {name: 'wifi-users', bridge_group_id: "1"},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
      "is_unique": "true"
    }
>

### <strong>Is VLan Num Unique</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which test whether a vLan num is alreay existed. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/is-vLan-name-unique.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>num</em> - int: num of the vLan.</b>
> &nbsp;&nbsp;<b><em>bridge_group_id</em> - int: id of the bridge group the vLan belongs to.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail'), 'is_unique' => true/false}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/is-vlan-num-unique.pl", {num: '201', bridge_group_id: "1"},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
      "is_unique": "true"
    }
>


### <strong>Remove IP From Location</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can remove an IP from a location. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/remove-ip-from-location.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the IP.</b>
> &nbsp;&nbsp;<b><em>type</em> - int: type of the IP to be removed(ipv4: 0, ipv6: 1).</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/remove-ip-from-location.pl", {id: '1', type: "0"},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Remove Location IP Plan</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can remove IP Plan from a location. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/remove-location-ip-plan.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the IP Plan.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/remove-location-ip-plan.pl", {id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>

### <strong>Remove Location</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can remove a location. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/remove-location.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the location to be removed.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/remove-location.pl", {id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>


### <strong>Remove VLan Host</strong>    
> #### Description:
> &nbsp;&nbsp;<b>This is the api which can remove vlan host. </b>
> #### Url:
> &nbsp;&nbsp;<b>api/remove-vlan-host.pl</b>
> #### Parameters:
> &nbsp;&nbsp;<b><em>id</em> - int: id of the host to be removed.</b>
> #### Return value(json):
> &nbsp;&nbsp;<b><em>result</em> : {'result' => 'Success'('Fail')}</b><br/>
> #### Example:
> ##### <em>JavaScript</em>
    $.post("../api/remove-vlan-host.pl", {id: '1'},function(data){
        var json = JSON.parse(data);        
        alert(json.result);
    });    
    Output:
    {
      "result":"Success",
    }
>

