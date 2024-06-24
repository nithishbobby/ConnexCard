import React from 'react';
import './Card.css'; // Add CSS for styling

const Card = ({ user }) => {
  return (
    <div className="card-container">
      <div className="card">
        <div className="card-header">
          <div className="card-profile-picture">
            <img src={user.profilePictureUrl} alt="Profile" />
          </div>
          <div className="card-details">
            <h2>{`${user.firstName} ${user.lastName}`}</h2>
            <p>{user.jobTitle}</p>
            <p>{user.company}</p>
            <p>{user.bio}</p>
          </div>
        </div>
        <div className="card-body">
          <div className="card-section">
            <h3>Skills</h3>
            <ul>
              {user.skills.map((skill, index) => (
                <li key={index}>{skill}</li>
              ))}
            </ul>
          </div>
          <div className="card-section">
            <h3>Experience</h3>
            <ul>
              {user.experience.map((exp, index) => (
                <li key={index}>
                  <strong>{exp.title}</strong> at {exp.company}
                </li>
              ))}
            </ul>
          </div>
          <div className="card-section">
            <h3>Education</h3>
            <ul>
              {user.education.map((edu, index) => (
                <li key={index}>
                  <strong>{edu.degree}</strong> at {edu.school}
                </li>
              ))}
            </ul>
          </div>
          {/* Add more sections as needed for projects, certifications, etc. */}
        </div>
        <div className="card-footer">
          <a href={user.linkedinUrl}>LinkedIn</a>
          <a href={user.githubUrl}>GitHub</a>
          <a href={user.twitterUrl}>Twitter</a>
          <a href={user.websiteUrl}>Website</a>
        </div>
      </div>
    </div>
  );
};

export default Card;
