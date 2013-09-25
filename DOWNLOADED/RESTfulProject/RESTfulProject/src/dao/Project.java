package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.FeedObjects;


public class Project {
	public ArrayList<FeedObjects> GetFeeds(Connection connection) throws Exception
	{
            ArrayList<FeedObjects> feedData = new ArrayList<FeedObjects>();
            try
            {
                //String uname = request.getParameter("uname");
                PreparedStatement ps = connection.prepareStatement("SELECT osmid, latitude, longitude, degree FROM points");
                //ps.setString(1,uname);
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    FeedObjects feedObject = new FeedObjects();
                    feedObject.setOsmid(rs.getString("osmid"));
                    feedObject.setLatitude(rs.getString("latitude"));
                    feedObject.setLongitude(rs.getString("longitude"));
                    feedObject.setDegree(rs.getString("degree"));
                    feedData.add(feedObject);
                }
                return feedData;
            }
            catch(Exception e)
            {
                    throw e;
            }
	}
	
}
